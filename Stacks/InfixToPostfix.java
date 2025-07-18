package Stacks;

import java.util.Stack;

public class InfixToPostfix {
     public static void main(String[] args) {
        String infix = "9-(5+3)*4/6"; 
        // 953+4*6/-

        System.out.println(infix);
        Stack<String> val = new Stack<>(); //two stacks -one stores val and one stores operand
        Stack<Character> op= new Stack<>();
        for(int i=0; i<infix.length(); i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch; //convert character to ascii val
            //0 -> 48 and 9 ->57
            if(ascii >=48 && ascii <=57){
                String s = "" +ch;
                val.push(s);

            } // to get the actual int instead of ascii value we subtract 48
            else if(op.size() ==0 || ch =='(' || op.peek() =='(') op.push(ch); //bracktshave highest priority so simply push operands(op) after opening brckts
            else if(ch ==')'){ //keep adding ops till we see ')'
                while(op.peek() !='('){ //jab tak opening brckt nahi dikhega work karte jao
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                  
                    char o =op.pop();
                    String t = v1+ v2+ o;
                    val.push(t);                 
                }
                op.pop(); //'(' hata diya
            }
            else{
                if(ch== '+' || ch== '-' ){ //'+' aur '-' ki equal precedence hoti hai but less than '*' ,'/'
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                     char o =op.pop();
                    String t = v1+ v2+ o;
                    val.push(t);       
                    
                    //push the current operator
                    op.push(ch);          
                }
              
                    
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek()=='/'){// agar already '*' ya '/' pade hai toh pehle work hoga
                    //work
                   String v2 = val.pop();
                    String v1 = val.pop();
                  
                    char o =op.pop();
                    String t = v1+ v2+ o;
                    val.push(t);   
                    op.push(ch);
                    }
                   else op.push(ch); //if the current operator is not * or /, then push it to the stack
                }
            }

        
        //val stack size -> 1
        while(val.size()>1){  //bachcha hua stack niptado
            String v2 = val.pop();
            String v1 = val.pop();
            char o =op.pop();
            String t =v1+ v2+ o;
            val.push(t);       
            
        }
        String postfix = val.pop();
        System.out.println(postfix);

    }
}
