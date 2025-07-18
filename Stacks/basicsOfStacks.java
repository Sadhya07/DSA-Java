package Stacks;

import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // System.out.println(st); //empty stack
        System.out.println(st.isEmpty()); //returns true if stack is empty, false otherwise
        //push(),pop(),peek() are all in T.C O(1)
        st.push(1); //adding ele to stack
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        System.out.println(st.peek()); //displays topmost ele of the stack
        System.out.println(st);
        st.pop(); //removes/pops the topmost element
        System.out.println(st);
        System.out.println("size is: " + st.size()); //returns the size of stack
        //get first ele
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
    
    
    }
}
