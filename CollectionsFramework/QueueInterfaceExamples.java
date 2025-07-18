package CollectionsFramework;
import java.util.*;

public class QueueInterfaceExamples {
    static void DequeExamples(){
        Deque<Integer> dq= new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.pollFirst()); //2
        System.out.println(dq.pollLast()); //4
        System.out.println(dq); //1 3 
    }
    static void PriorityQueueExamples(){
        // PriorityQueue<Integer> pq= new PriorityQueue<>(); // min PQ//By Default - min PQ i.e.smallest ele have the highest priority
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); //5 
        System.out.println(pq); //Garuntee -topmost priority ele will be processed first
        System.out.println(pq.poll()); //5 will be removed
        System.out.println(pq); //7 10
        System.out.println(pq.peek()); //7
        pq.add(4);
        pq.add(9);
        pq.add(15);
        System.out.println(pq); //[4, 9, 7, 10, 15]
        pq.remove();
        pq.remove();
        System.out.println(pq);//[9, 10, 15]
    }
    static void QueueExamples(){
        LinkedList<Integer> q= new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek()); //1
        System.out.println(q.poll()); // 1 will be removed
        System.out.println(q.peek()); //2
        System.out.println(q.isEmpty()); //false
        System.out.println(q.size()); //2

    }
    public static void main(String[] args) {
        // QueueExamples();
        // PriorityQueueExamples();
       DequeExamples();
        
    }
    
}
