package Stacks;

public class LLimplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        private Node head = null;
        private int size =0;
        void push(int x){
            Node temp =new Node(x);
            temp.next =head;//link the new node to the current head
            head = temp; //new node becomes the head
            size++;
        }        
        int pop(){
            if(head ==null){
                System.out.println("Stack is empty");
                return -1; 
            }
            int x =head.val;
            head =head.next;
            return x;
        }
        int peek(){
            if(head ==null){
                System.out.println("Stack is empty");
                return -1; 
            }
            return head.val; //return the value of the head node
        }
        void displayrec(Node h){
            if(h ==null) return; //base case
            displayrec(h.next); //recursive call to the next node
            System.out.print(h.val +" "); //print the value of the current node

        }
        void display(){
            displayrec(head); //call the recursive display function
            System.out.println();
        }


        void displayRev(){
            Node temp =head;
            while(temp !=null){
                System.out.print(temp.val +" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){ //getter
            return size; //return the current size of the stack
        }
        boolean isEmpty(){
            if(size ==0) return true;
            else return false; //if size is 0, stack is empty
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4); //4
        st.display();
        st.push(5); //5 4
        st.display();
        st.push(6); //6 5 4
        st.display();
        System.out.println(st.peek()); //6
        System.out.println(st.pop()); //6
        st.display(); //5 4
        System.out.println(st.peek()); //5
        System.out.println(st.pop()); //5
        st.display(); //4
        System.out.println(st.peek()); //4
        System.out.println(st.pop()); //4
        st.display(); //empty stack
        
    }
}
}
