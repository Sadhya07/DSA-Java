import java.util.*;
public class HashMapImplementation {

    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY =4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        //jo bhi helper funct hai unhe private rakho sirf jo duniya ko dikhane hai unhe public karo
        private class Node{
            K key; //K can be any data type- just denotes the key
            V value; 
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n ;
        private LinkedList<Node> [] buckets; //array of linked lists

        private void initBuckets(int N){ //N- capacity/size of buckets array
            buckets = new LinkedList[N]; //creating an array of linked lists
            for(int i=0 ; i< buckets.length; i++){
                buckets[i] = new LinkedList<>(); //initializing each bucket with a linked list
            }

        }
        private int HashFunc(K key){ //hash function to find the index of the bucket for a given key
            int hc= key.hashCode(); //hashCode() returns an int, we take mod with length of buckets to get index
            return Math.abs(hc) % buckets.length; //to avoid negative index, we take absolute value
        }
        //Traverses the ll and looks for a node with the given key, if found then returnd idx otherwise return null
        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i=0; i< ll.size(); i++){
                if(ll.get(i).key.equals(key)){  //if key matches with the key of the node at index i
                    return i;
                }
            }
            return -1; //if key not found, return -1

        }
        private void rehash(){ //rehash the map when load factor exceeds
            LinkedList<Node> [] oldBuckets = buckets; //store the old buckets
            initBuckets(2 * oldBuckets.length); //create new buckets with double the size
            n = 0; //reset size to 0
            for(LinkedList<Node> bucket : oldBuckets){ //for each bucket in old buckets
                for(var node : bucket){ //for each node in the bucket
                    put(node.key, node.value); //put the key-value pair in the new buckets
                }
            }
        }

        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        public int capacity(){
            return buckets.length;
        }
        public float loadFactor(){ //return the load factor of the map
            return (float)n / buckets.length; //load factor = no. of entries / capacity of buckets
        }

        public int size(){ //return the no. of entries in map
            return n;
        }

        public void put(K key, V value){
            int bi = HashFunc(key); //get the index of the bucket for the given key
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key); //search for the key in the bucket
            if(ei == -1){ //if key doesn't exist, we have to insert a new node
                Node node = new Node(key, value);
                currBucket.add(node); //add the new node to the bucket
                n++;
            }else{ //update curr value of the node
                Node currNode = currBucket.get(ei); //get the node at index ei
                currNode.value = value; //update the value of the node

            }
            if(n >= buckets.length * DEFAULT_LOAD_FACTOR){ //if load factor exceeds, we need to rehash
                rehash(); //rehash ek internal funct hai isse user ko koi farak nhi padta
            }

        }
        public V get(K key){
            int bi = HashFunc(key); //get the index of the bucket for the given key
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key); //search for the key in the bucket
            if(ei != -1){ //if key exists, return the value of the node
                Node currNode = currBucket.get(ei); //get the node at index ei
                return currNode.value; //return the value of the node
            }
            return null; //if key not found, return null

        }
        public V remove(K key){
            int bi = HashFunc(key); //get the index of the bucket for the given key
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key); //search for the key in the bucket
            if(ei != -1){ //if key exists, remove the node and return its value
                Node currNode = currBucket.remove(ei); //remove the node at index ei
                n--;
                return currNode.value; //return the value of the node
            }
            return null; //if key not found, return null

        }

    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> mp=new MyHashMap<>();
        // MyHashMap<String, String> mp2= new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        mp.put("y", 71);
        mp.put("x", 61);
        System.out.println("Testing size " +mp.size()); //3
        mp.put("c", 30);
        System.out.println("Testing size " +mp.size()); //3

        //Testing get
        System.out.println(mp.get("a")); //1
        System.out.println(mp.get("b")); //2
        System.out.println(mp.get("c")); //30
        System.out.println(mp.get("college"));

        System.out.println(mp.remove("c")); //30
        System.out.println(mp.remove("c")); //null
        System.out.println("Testing size " + mp.size()); //2
        System.out.println(mp.get("x")); //61
        System.out.println(mp.get("y")); //71
        System.out.println("CAPACITY " +mp.capacity()); //8
        System.out.println("LOAD FACTOR" +mp.loadFactor()); //0.5 <0.75



        
    }
    
}
