package Stacks;

import java.util.Stack;

public class displayStack {
    public static void displayReverseRec(Stack<Integer> st){
        if(st.isEmpty()) return; //base case 
        //if(st.size() ==0)
        int x = st.pop(); //pop the top element
        System.out.print(x + " "); //display the popped element
        displayReverseRec(st); //recursive call
        st.push(x); //push the popped element back to the stack
    }
    public static void displayRec(Stack<Integer> st){
        if(st.isEmpty()) return; 
        int x = st.pop(); 
        displayRec(st); //recursive call
        System.out.print(x + " "); //display the popped element
        st.push(x); //push the popped element back to the stack
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1); 
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverseRec(st);
        System.out.println();
        displayRec(st);
        Stack<Integer> rt = new Stack<>();

        // while(st.size() >0){
        //     rt.push(st.pop());
        // }
        // while(rt.size()>0){
        //     int x= rt.pop();
        //     System.out.print(x + " "); //display elements in the stack
        //     st.push(x); //push back to the original stack
            
        // }
        // System.out.println(st);
        // //array used for display
        // int n =st.size();
        // int[] arr = new int[n];
        // for(int i=n-1; i>=0; i--){
        //     arr[i] =st.pop();
        // }
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " "); //display elements in the array
        //     st.push(arr[i]); //push back to the original stack
        // }

        


    }
    
}
