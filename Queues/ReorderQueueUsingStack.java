package Queues;
import java.util.*;

public class ReorderQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int n = q.size(); //q ka size har baar change hoga toh pehle se size define karna hoga
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
        //Step 1- push 1rst half of queue into stack
        for(int i=1; i<= n/2; i++){
            st.push(q.remove());
        } // 5 6 7 8                   //Stack top : 4 3 2 1
        //Step2- empty the stack into queue
        while(st.size() >0){
            q.add(st.pop());
        } // 5 6 7 8 4 3 2 1
        //Step3- push 2nd half of queue into stack
        for(int i=1; i<= n/2; i++){
            st.push(q.remove());
        } // 4 3 2 1                  //Stack top : 8 7 6 5
        //Step4- add the elements of stack and queue alternatively
            for(int i=1; i<= n/2; i++) {
            //one by one alternate ele pehle stack se phir queue se
            q.add(st.pop());
            q.add(q.remove());
        }
        // 8 4 7 3 6 2 5 1
        //Step 5 -reverse the queue
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q); // 1 5 2 6 3 7 4 8
    
    }
    
}
