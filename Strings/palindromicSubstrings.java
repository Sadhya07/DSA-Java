import java.util.*;
public class palindromicSubstrings{
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;       
        }
        return true;
    }
    public static void main(String[] args) {
        String str ="abcdcba";
        int count =0;
        for(int i=0; i<str.length(); i++){  //i ranges from 0 to last element i.e str.length()-1
            for(int j=i+1; i<=str.length();j++){  //j ranges from i+1 to complete length i.e to include last element
                if (isPalindrome(str.substring(i,j)) ==true) {
                    System.out.print(str.substring(i,j)+ " ");
                    count++;  
                }
            }
        }
    System.out.println("The number of palindromic substrings are: " +count);

     }

}

