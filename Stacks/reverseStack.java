package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void pushAtBottom(Stack<Integer> st,int x){
        // Stack<Integer> rt = new Stack<>();
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // st.push(x);
        // while(rt.size()>0){
        //     st.push(rt.pop());
        // }
        if(st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st , x);
        st.push(top);
        
    }
    public static void reverseRec(Stack<Integer> st){
        if(st.size() ==1) return; //base case
        int top =st.pop(); //pop the top ele
        reverseRec(st); //ask recursion to rev the rest of ele
        pushAtBottom(st, top); //push the top ele at the bottom of the stack
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // //reverse the stack
        // Stack<Integer> rt =new Stack<>();
        // while(st.size() >0){
        //     rt.push(st.pop());
        // }
        // System.out.println(rt);
        // Stack<Integer> qt = new Stack<>();
        // while(rt.size()>0){
        //     qt.push(rt.pop());
        // }
        // System.out.println(qt);
        // while(qt.size() >0){
        //     st.push(qt.pop());
        // }
        // System.out.println(st);
        // reverseRec(st);
        pushAtBottom(st,9); // 9 1 2 3 4 5
        reverseRec(st);
        System.out.println(st);
    }
    
}
