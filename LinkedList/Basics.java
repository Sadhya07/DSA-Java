package LinkedList;
import java.util.LinkedList;

public class Basics {

    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t =head;
        while(t.next !=null){
            t=t.next; //traverse to the last node
        }
        t.next = temp; //link the last node to the new node
    }
    public static void displayr(Node head){
        if(head ==null) return; //base case
        System.out.print(head.data+" ");
        displayr(head.next); //recursive call
    }

    public static void displayreverse(Node head){
        if(head ==null) return; //base case
        displayreverse(head.next); //recursive call
        System.out.print(head.data+" ");
    }
    
    public static void display(Node head){
       while(head != null){
            System.out.print(head.data + " ");
            head = head.next; //head now points to the next node
        }
    }

    public static int length(Node head){
        int count=0;
       while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    
    
    public static class Node{
        int data;//value
        Node next;//address of next node
        Node(int data){
            this.data =data;
        }
    }
    public static void main(String[] args) {
        //LinkedList<Integer> ll = new LinkedList<>();
        //Node x= new Node();
        //System.out.println(x.next);
        Node a= new Node(5); 
        //System.out.println(a.next);//null as it is not linked to any other node  
        Node b= new Node(3);   
        Node c= new Node(9);
        Node d= new Node(8);
        Node e= new Node(16);
        //Linking nodes: 5 -> 3 -> 9 -> 8 -> 16
        a.next = b; //address of b stored in a 
        // System.out.println(a);//$Node@28a418fc
        // System.out.println(a.next);//$Node@5305068a -exactly same as b
        // System.out.println(b);//$Node@5305068a
        // System.out.println(a.next.data);//3
        b.next = c; 
        c.next = d;
        d.next = e; 
        // System.out.println(a.next.next.data);//9
        // System.out.println(a.next.next.next.data);//8
        
        Node temp = a; //temp is pointing to a
        // for(int i=1; i<=5; i++){ //when length is known
        //     System.out.print(temp.data + " ");
        //     temp = temp.next; //temp now points to the next node
        // }

        // while(temp != null){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;         }
        display(a);
        System.out.println();
        displayr(a);
        displayreverse(a);
        System.out.println();
        System.out.println(length(a)); 
        insertAtEnd(a,87);
        display(a);
       
   }

}
