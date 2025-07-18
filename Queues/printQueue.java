package Queues;

import java.util.*;


public class printQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        // while(q.size()>0){
        //     System.out.print(q.peek());
        //     q.remove();
        // }

        Queue<Integer> v = new LinkedList<>();
        while(q.size()>0){
            int x = q.remove();
            v.add(x);
            System.out.print(x+ " ");
            
        }
        while(v.size()>0){
          q.add(v.remove());
        }
        System.out.println(q);
  
    }
    
}
