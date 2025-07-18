package LinkedList;

public class nthNodeFromEnd {
    public static Node nthNode(Node head, int n){ //Node - function return data type(user defined)
        int size =0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size-n+1; //from start mth :(size-n+1)th node is the nth node from end
        temp = head;
        for(int i=1; i<=m-1;i++){
            temp = temp.next; //traverse to the mth node
        }
        return temp;
    
    }
    public static Node nthNode2(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1; i<=n; i++){
            fast=fast.next; //move fast pointer n nodes ahead
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next; //move both pointers until fast reaches the end
        }
        return slow; //slow pointer will be at the nth node from end
    }
    public static Node remoneNthNodefromEnd(Node head, int n){ //delete from end 
        Node slow =head;
        Node fast =head;
        for(int i=1; i<=n; i++){
            fast = fast.next; //move fast pointer n nodes ahead
        }
        if (fast==null) {
            head = head.next; //if n is equal to the length of the list, remove the head
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return head; //return the modified head
        
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

   public static void main(String[] args) {
    Node a =new Node(100);
    Node b =new Node(13);
    Node c =new Node(4);
    Node d =new Node(5);
    Node e =new Node(12);
    Node f =new Node(10);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=f;

    Node q = nthNode2(a,2);
    System.out.println(q.data);//12
    display(a); // 100 13 4 5 12 10
    a= remoneNthNodefromEnd(a,6);
    display(a); // 13 4 5 12 10
 


   }
    
}
