package Stacks;
import java.util.Stack;

public class underflowOverflow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st); 
        st.pop();
        System.out.println(st); 
        st.pop();
        System.out.println(st); 
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        // st.pop(); :Underflow condn -empty stack
        //will show error if we use pop() or peek() function
        // System.out.println(st); 


    }
}
