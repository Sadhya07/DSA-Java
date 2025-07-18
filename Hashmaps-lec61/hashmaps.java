import java.util.*;


public class hashmaps{
    static void HashMapsMethods(){
        //Syntax
        Map<String,Integer> mp=new HashMap<>();
        //Adding elements 
        mp.put("Akaash", 21);
        mp.put("Yash",16 );
        mp.put("Lav",17 );
        mp.put("Rishika",19 );
        mp.put("Harry", 18);
        //Getting value of a key from Hashmap
        System.out.println(mp.get("Yash")); //16
        System.out.println(mp.get("Rahul")); //null
        //Changing value of a key in the Hashmap
        mp.put("Akaash",25); //Aakash ->25
        System.out.println(mp.get("Akaash")); //25
        //Removing a pair from the Hashmap
        System.out.println(mp.remove("Akaash"));  //25
        System.out.println(mp.remove("riya"));  //null ->key doesnot exist
        //Checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Akaash")); //false
        System.out.println(mp.containsKey("Yash")); //true
        //Adding a new entry only if the new key doesn't already exist 
        mp.putIfAbsent("Yashika", 30);// will enter
        mp.putIfAbsent("Yash", 30);  //will not enter
        //Get all the keys in the Hashmap
        System.out.println(mp.keySet());
        //Get all the values in the Hashmap   
        System.out.println(mp.values());     
        //Get all the entries in the Hashmap
        System.out.println(mp.entrySet());
        //Traversing all entries of Hashmap - multiple methods
        for(String key : mp.keySet()){      //for each loop
            System.out.printf("Age of %s is %d\n" , key, mp.get(key));//%s is for String, %d is for Integer
        }
        System.out.println();
        for(Map.Entry<String, Integer> e: mp.entrySet()){ //Map.Entry is a nested interface in Map which represents a key-value pair
            System.out.printf("Age of %s is %d\n" , e.getKey(), e.getValue());
        }
        System.out.println();
        for(var e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n" , e.getKey(), e.getValue());
        }
 }
  

    public static void main(String[] args) {
        HashMapsMethods();
        int [] arr={1,3,2,1,4,1};
        
        //finding Max frequency element
        Map<Integer,Integer>freq=new HashMap<>();
        for(int ele: arr){
            if(!freq.containsKey(ele)){ //agar ele exist nahi karta freq map mai already toh usse add karke val 1 daalenge
                freq.put(ele, 1);
            }else{ //otherwise pre=existing ele dobara aata hai toh update its val/count by 1
                freq.put(ele, freq.get(ele)+1);
            }
          
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());
        int maxFreq=-0 , ansKey=-1;
        for(var e: freq.entrySet()){
            if (e.getValue() >maxFreq) {
                maxFreq=e.getValue();
                ansKey =e.getKey();
            }
        }

        // for(var key: freq.keySet())
        // if (freq.get(key)>maxFreq) {
        //     maxFreq=freq.get(key);
        //     ansKey=key;
        // }
        System.out.printf("%d has max frequency and it occurs %d times" , ansKey, maxFreq);
   
   
    
    }
}