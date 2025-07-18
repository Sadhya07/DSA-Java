import java.util.*;

public class printAllSubstrings {
    public static void main(String[] args) {
        String s="abcd";
        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){  //till 4 becoz last index is excluded 
                System.out.print(s.substring(i,j)+ " ");
            }
        }
    }
    
}
