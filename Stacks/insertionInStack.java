package Stacks;
import java.util.Stack;

public class insertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx =3;
        int x =12;
        Stack<Integer> temp = new Stack<>();
        while(st.size() > idx){
            temp.push(st.pop()); //pop elements from st and push to temp until we reach the index
        }
        st.push(x);
        while(temp.size()> 0){
            st.push(temp.pop()); //pop elements from temp and push back to st
        }
        System.out.println(st);
    }
    
}
