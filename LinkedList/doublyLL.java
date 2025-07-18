package LinkedList;

public class doublyLL {
    public static class Node{
        int val;
        Node next; //null by default
        Node prev; //null by default
        Node(int val){
            this.val =val;
        }
    }
    public static void display(Node head){
        Node temp =head;
        while(temp !=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp !=null){
            System.out.print(temp.val +" ");
            temp = temp.prev;
        }
        System.out.println();
    }
     public static void display2(Node random){ //any node is given and we have to print the entire list
        Node temp =random;
        //Move this temp backwards to the head
        while(temp.prev !=null){
          temp = temp.prev;
        }
        //now temp is at head
        //print the list from head to tail
        while(temp !=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head, int x){
        Node t =new Node(x);
        t.next = head;
        head.prev = t; //doubly linked hai toh head ko bhi prev node se join karna padega
        head = t;
        return head;
    }
    public static void insertAtTail(Node head, int x){
        //pehle tail tak leke jayenge
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        //ab naya node insert karenge
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
        temp = t; 
    }

    
    public static void main(String[] args) {
        //4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev =null;
        a.next = b;
        b.prev = a; //linking previous node i.e b points to a
        b.next = c;
        c.prev = b; //linking previous node i.e c points to b
        c.next = d;
        d.prev = c; 
        d.next = e;
        e.prev = d;
        e.next = null; 
        // display(a);
        // displayrev(e);
        // display2(c);
        // Node newHead = insertAtHead(a,35);
        // display(newHead); //35 4 10 2 99 13
        insertAtTail(a,90 );
        display(a);
        
    }
    
}
