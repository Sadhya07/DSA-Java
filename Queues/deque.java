package Queues;
// import java.util.Deque;
// import java.util.LinkedList;
import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        //add, remove/poll peek/element
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);

        dq.addFirst(5);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.addLast(6);
        dq.addLast(7);
        dq.addFirst(14);
        System.out.println(dq);
        dq.removeFirstOccurrence(2);
        dq.removeLastOccurrence(5);
    }
    
}
