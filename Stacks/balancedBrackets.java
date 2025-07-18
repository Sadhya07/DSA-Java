package Stacks;
import java.util.*;

public class balancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i); //get the character of the string at index i
            if(ch == '('){
                st.push(ch); //if the character is '(', push it onto the stack
            }
            else{ // ch==')'
                if(st.size() == 0) return false; //if the stack is empty and we encounter a ')', it means the brackets are not balanced
                if(st.peek() == '(') st.pop(); //if the top of the stack is '(', pop it from the stack
                else return false; //if the top of the stack is not '(', it means the brackets are not balanced

            }
        }
        if(st.size() > 0) return false; //if the stack is not empty after processing the entire string, it means there are unmatched '(' brackets
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        

    }
    
}
