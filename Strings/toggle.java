import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str= new StringBuilder(sc.nextLine()); //taking input for StringBuilder
        System.out.println(str);
        //toggle
        //PHysiCs -> phYSIcS
        for(int i =0; i<str.length(); i++){
            //P->p
            //check -> alphabet is small/capital
            boolean flag =true; //true->capital
            char ch= str.charAt(i); //A
            if(ch==' ') continue; //deals with case with there is space between words
            int asci =(int)ch; //65
            if (asci>=65) { //if numbers in string then skip them 
                
            
            if (asci>=97)  flag=false; //small
            if (flag==true) { //capital
                asci +=32;  //97
                char dh=(char)asci;  //a
                str.setCharAt(i, dh);
            }else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }     
        }else{
            continue;
        }      
        }
        System.out.println(str);
    }
    
}
