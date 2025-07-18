package backTracking;

import java.util.*;

public class printPermutations {
    public static void printp(String str, String t, List<String> l){
        if(str.equals("")){ //.equals() used in strings(compares char by char instead of address value like == does)
            l.add(t);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i); // we want char upto that char not the char itself to be included
            String right = str.substring(i +1); //char ke baad ke saare char
            String rem = left + right; 
            printp(rem, t+ch ,l);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        List<String> l = new ArrayList<>(); //ArrayList passed by reference in java
        printp(str, "" ,l);
        for(int i=0; i< l.size(); i++){
            System.out.println(l.get(i));
        }
    }
    
}
