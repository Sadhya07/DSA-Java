package CollectionsFramework;
import java.util.*;

public class SetInterfaceExamples {

    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st); //1,2,3
        st.add(1); //duplicate ele are not considered
        st.add(1);
        st.add(2);
        System.out.println(st); //1,2,3 -still remains same as set has unique elements only
        st.remove(2);
        System.out.println(st.contains(5)); //false
        System.out.println(st.size()); //2


        
    }
    
}
