package Recursion2;

import java.util.Scanner;

public class StringRecursion {

    static String reverse(String s, int idx){
        //base case 
        if (idx==s.length()) return "";
        //self work 
        // char currChar = s.charAt(idx);
        String smallAns= reverse(s, idx+1);
        //recursive work

        return smallAns + s.charAt(idx);

    }
    static String removeOccurences2(String s){
        if (s.length()==0) return ""; //passing substrings in  recursive tree
        String smallAns= removeOccurences2(s.substring(1));
        char currChar =s.charAt(0);
        if (currChar !='a') {
            return currChar +smallAns;
            
        } 
        return smallAns;

    }
    static String removeOccurences(String s, int idx){
        //base case
        if (idx==s.length())   return ""; //return empty string
        //recursive work
        String smallAns = removeOccurences(s, idx+1);
        //self work 
        char currChar= s.charAt(idx);
        if (currChar !='a') {
            return currChar +smallAns;
            
        } 
        return smallAns;
    }
    

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        String rev =reverse(s,0);
        if (rev.equals(s)) {
            System.out.printf("%s is Palindrome" , s);            
        }else{
            System.out.printf("%s is Not Palindrome" , s);
        }
        // System.out.println(s);
        // char ch=s.charAt(0);
        /*
         * College
         * 0123456
         * n=7
         */
        // for(int i=0; i<s.length(); i++){
        //     System.out.println(s.charAt(i));
        // }
        // System.out.println(s.substring(2)); //in substring(), slice string from starting index till 
        //last index but last index is excluded and is optional to give
        // System.out.println(removeOccurences(s,0));
        // System.out.println(removeOccurences2(s));
        //System.out.println(reverse(s,0));
    
    }
}
