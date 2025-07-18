import java.util.*;

public class stringbasics {
    public static void main(String[] args) {
        // char[] arr= new char[10]; ->limitation to using char
        //strings are array of characters
        Scanner sc= new Scanner(System.in);
        // String str="Physics Wallah";
        // System.out.println(str);
        // String s=sc.next();
        // String s=sc.nextLine();
        // System.out.println(s);
        
        // String str="Hello";
        // System.out.println(str.length());
        // char ch=str.charAt(3);
        // System.out.println(ch);
        // System.out.println(str.indexOf('l'));
        // String gtr="Dello";  //d e f g h therefore d is 4 places/ASCII values behind hence +4
        // System.out.println(str.compareTo(gtr));

        // String str="Physics Wallah";
        // System.out.println(str.toLowerCase());
        // System.out.println(str.contains("all"));
        // System.out.println(str.endsWith("ah"));
        String s1="abc";
        String s2="def";
        String s3= s1.concat(s2);

        System.out.println(s3);

    }
}
