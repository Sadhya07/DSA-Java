package Stacks;

public class arrayImplementation {
    public static class Stack{
        private int[] arr =new int[5];
        private int idx= 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return; //if stack is full, we return
            }
            arr[idx] = x; //insert element in array index
            idx++; //increment index
        }
        int peek(){
            if(idx ==0){
                System.out.println("Stack is empty");
                return -1; //return -1 if stack is empty
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1]; //get the top element by accessing the last index
            arr[idx-1] = 0; //set the last index to 0
            idx--; //because we are removing the top element, we decrement the index
            return top; //return the top element
        }
        void display(){
            for(int i=0; i<= idx-1; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
        int size(){
            return idx; //return the current size of the stack
        }
        boolean isEmpty(){
            if(idx ==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx == arr.length) return true; //if index is equal to the length of the array, stack is full
            else return false;
        }
        int capacity(){
            return arr.length; //return the capacity of the stack
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4); //4
        st.display();
        st.push(5); //4 5
        st.display();
        st.push(6); //4 5 6
        st.display();
        System.out.println(st.size()); //3
        st.pop();
        st.display(); //4 5
        System.out.println(st.size());
        st.push(7);
        st.push(0);
        st.push(8); //4 5 7 0 8
        st.push(6);
        System.out.println(st.isFull());
    
    
    }
    
}
