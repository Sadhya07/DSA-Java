package LinkedList;

public class reverseList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){
        if(head.next ==null) return head; //base case: if only one node, return it
        Node newHead = reverse(head.next); //recursive call to reverse the rest of the list
        head.next.next = head; //interchanging connections 1->2<-3 then it will become 1<-2<-3
        head.next = null; //set the next of the current node to null to avoid cycle
        
        return newHead; //return the new head of the reversed list
    }
    // public static void displayRev(Node head){
    //     if(head == null) return; //base case
    //     displayRev(head.next); //recursive call
    //     System.out.print(head.val + " ");//work
    // }
    public static void display(Node head){
        if(head == null){
            System.out.println();
             return;
        } //base case   
        System.out.print(head.val + " ");//work
        display(head.next); //recursive call
        
    
    }
    public static void main(String[] args) {
        Node a =new Node(3);
        Node b =new Node(5);
        Node c =new Node(1);
        Node d =new Node(2);
        Node e =new Node(4);
        Node f =new Node(7);
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =f;
        // displayRev(a);
        display(a);
        
        Node r = reverse(a);
        display(r);

    
    
    }
    
}
