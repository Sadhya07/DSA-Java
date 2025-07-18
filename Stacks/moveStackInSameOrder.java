package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        // int n;
        // System.out.println("Enter the number of elements you want to insert");
        // n = sc.nextInt();
        // System.out.println("Enter the elements");
        // for(int i =1; i<=n; i++){
        //     int x = sc.nextInt();
        //     st.push(x); //pushing elements into the stack
        // }
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //reverse order
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            // int x = st.peek(); //access top ele of st
            // rt.push(x); //add to rt
            // st.pop(); //remove ele from st
            gt.push(st.pop()); //pop from st and push to gt

        }
        Stack<Integer> rt = new Stack<>();
        while(gt.size() >0){
            rt.push(gt.pop());
        }

        System.out.println(rt);



    }
    
}
