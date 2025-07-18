package Queues;
import java.util.*;

public class reverseKelements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first k elements to be reversed:");
        int k = sc.nextInt();
        if(q.size() ==0){
            System.out.println("Queue is empty");
            return;
        }
        //push first k elements into stack
        for(int i=0; i<k; i++){
            st.push(q.remove());
        }
        //pop elements back into queue that are reversed
        while(st.size()>0){
            q.add(st.pop());
        }
        //put the elements that were not reversed after the reversed elements
        for(int i=0; i< q.size()-k ; i++){
            q.add(q.remove());
        }
        System.out.println(q);

    }
    
}
