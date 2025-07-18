import java.util.*;

public class stringintchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abc";
        // str+="xyz";
        // str+='r';
        // str+=10;
        System.out.println(str+10+20);  //reads 10 and 20 as string becoz operation from left to right
        System.out.println("abc" +(10+20)); //BODMASS follows so 30 calculated first then converted to string
        System.out.println(10+20+"abc");
    }
    
}
