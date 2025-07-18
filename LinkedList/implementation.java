package LinkedList;

public class implementation {
    public static class Node {
        int data; 
        Node next; 
        Node(int data) {
            this.data = data;
        }
    }
    //Node-user defined datatype but linkedlist-data structure
    public static class linkedlist{
        Node head =null; //initialize
        Node tail =null;
        int size =0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){ //if list is empty
                head = temp; //head points to the new node
                //tail = temp; //tail also points to the new node
            } else {
                tail.next = temp; //linking the last node to the new node
                //tail = temp; //updating tail to point to the new node
            }
            tail = temp; //tail always points to the last node
            size++;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head ==null){ //empty list
               head =tail =temp; 
               //insertAtEnd(val); //for empty list, insert at end is same as insert at head as head,tail and temp all point to the same node
            }else{ //non-empty list
                temp.next =head;
                head =temp;
            }
            size++;
        }
        void insertAt(int idx, int val){
            Node t =new Node(val);
            Node temp = head;
            if (idx==size()) {
                insertAtEnd(val);
                return; //if index is equal to size, insert at end
            }else if(idx==0){
                insertAtHead(val);
                return; //if index is 0, insert at head
            }else if(idx<0 || idx>size()){
                System.out.println("Invalid index");
                return; //if index is invalid, do nothing
            }
            for(int i=1; i<=idx-1; i++){
                temp = temp.next; //traverse to the node before the index
            }
            t.next = temp.next; //link the new node to the next node
            //new node should be connected first before breaking the previous node's link and joining it with the new node
            temp.next = t; //link the previous node to the new node
            size++;
        }
        int getAt(int idx){
            if(idx<0 || idx>size()){
                System.out.println("Invalid index");
                return -1;
            }
            Node temp =head;
            for(int i=1; i<=idx; i++){
                temp= temp.next;
            }
            return temp.data;
            
        }
        void deleteAt(int idx){
        Node temp = head;
        if(idx==0){
            head = head.next; //if deleting the head, update head to the next node
            size--;  
            return;
        }
            for(int i=1; i<=idx-1; i++){
            temp= temp.next;
        }
        temp.next= temp.next.next; //link the previous node to the next node of the node to be deleted
        if(idx==size-1){
            tail =temp; //if deleting the last node, update tail
        }
        size--;
    }


        void display() { //no parameter as we are using class variable head
            Node temp = head; //start from head
            while(temp != null) { //traverse till the end
                System.out.print(temp.data + " "); //print data
                temp = temp.next; //move to next node
            }
            System.out.println(); //new line after displaying all nodes
        }
        int size(){
            Node temp = head;
            int count=0;
            while(temp !=null){
                count++;
                temp = temp.next;
            }
            return count;
        }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4); //4
        ll.display();
        ll.insertAtEnd(5); //4 -> 5
        ll.display();
        ll.insertAtEnd(23);
        ll.display();
        ll.insertAtHead(13);
        ll.display(); //13 -> 4 -> 5 -> 23
        // System.out.println(ll.size());
        ll.insertAt(2,10);
        ll.display(); //13 -> 4 -> 10 -> 5 -> 23
        ll.insertAt(5,6 );//13 -> 4 -> 10 -> 5 -> 23-> 6
        ll.display(); 
        System.out.println(ll.tail.data);//tail is still at 23
        System.out.println(ll.getAt(3));
       // System.out.println(ll.size); given as attribute instead of func
        ll.deleteAt(2);
        ll.display(); //13 -> 4 -> 5 -> 23 -> 6
        ll.deleteAt(4);
        System.out.println(ll.tail.data);

    }
}
