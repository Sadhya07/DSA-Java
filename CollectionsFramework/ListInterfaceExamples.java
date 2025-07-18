package CollectionsFramework;

import java.util.*;

public class ListInterfaceExamples {
    static void ArrayListExamples(){
        ArrayList<Integer> l  =new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1)); // Accessing element at index 1
        l.set(1,10);
        System.out.println(l); //1 , 10, 3
        System.out.println(l.contains(10)); //
    }
    static void StackExamples(){
        Stack<String> st= new Stack<>();
        st.push("pw");
        st.push("Skills");
        System.out.println(st.peek()); //skills
        System.out.println(st.pop());
        System.out.println(st.peek()); //pw
        System.out.println(st.size()); //1
        System.out.println(st.isEmpty()); //false
    }
    public static void main(String[] args) {
        ArrayListExamples();
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        System.out.println(ll.get(1)); // Accessing element at index 1
        ll.set(1,10);
        System.out.println(ll); //1 , 10, 3
        System.out.println(ll.contains(10)); //
        
    }
}
