import java.util.*;
public class toggleStrings {
    public static void main(String[] args) {
        String str ="PhYSiCs";
        System.out.println(str);
        //StringBuilder sb=new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
            boolean flag =true; //true->capital
            char ch= str.charAt(i);
            if(ch==' ') continue; //deals with case with there is space between words
            int asci =(int)ch;
            
            if (asci>=97)  flag=false; //small
            if (flag==true) { //capital
                asci +=32;  //97
                char dh=(char)asci;  //a
                str = str.substring(0, i) +dh +str.substring(i+1);
            }else{
                asci-=32;
                char dh=(char)asci;
                str = str.substring(0, i) +dh +str.substring(i+1);
        }
    }
    System.out.println(str);
}
}
