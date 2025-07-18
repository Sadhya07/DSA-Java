package Stacks;
import java.util.*;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();//value is taken as string & conversn bhi dusre string mai ho raha hai
        for(int i=str.length()-1; i>=0 ; i--){ //when prefix given-> move from end to start 
            char ch= str.charAt(i);
            int ascii = (int)ch;
            if(ascii >=48 && ascii<=57){
                val.push(ch +"");
            }else{
                String v1 =val.pop(); //first ele popped is v1 as ulta chal rahe hum
                String v2 = val.pop();
                char op =ch;
                //v1 v2 op
                String t =v1 + v2+ op;
                val.push(t);
            }
        }
        System.out.println(val.peek()); //953+4*6/-
    }
}
