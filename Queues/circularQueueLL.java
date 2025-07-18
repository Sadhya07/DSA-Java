package Queues;

public class circularQueueLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class CQLL{
        Node head = null;
        Node tail = null;
        int size =0;
        
        public void add(int x){
            Node temp = new Node(x);
            if(size ==0){
                head = tail = temp;
            }
            else{
                tail.next = temp; //tail -> responsible for addition
                tail = temp;
                tail.next = head; //circular link

            }
            size++;
        }
        public int peek(){
            if(size ==0){ 
            System.out.println("Queue is empty!");
            return -1;
        }
            return head.val;
        }
        public int remove(){
            if(size ==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next; 
            tail.next = head;
            size--;
            return x;
        }
        public void display(){
            if(size ==0){
                System.out.println("Queue is empty!");
                return;
            } 
            System.out.print(head.val + " ");
            Node temp = head.next;
            while(temp != head){
                System.out.print(temp.val + " ");
                temp = temp.next;
        }
        System.out.println();
        }
        public boolean isEmpty(){
            if(size ==0) return true;
            else return false;
        }   

    }
    
    public static void main(String[] args) {
        CQLL q = new CQLL();
        q.display();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.isEmpty());
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());

        
    }
    
}
