package HashSetLec62;
import java.util.*;

public class MaxNumbers {

    static int maxNumbersOnTable(int[] bag){
        HashSet<Integer> table = new HashSet<>();
        int max =0;
        for(int i =0; i<bag.length; i++){
            int num = bag[i];
            if(table.contains(num)){ //if table already has the num, then remove it from bag as well as table
                table.remove(num);
            }else{
                table.add(num); //if num not +nt on table , add it to table
                max = Math.max(max, table.size()); //maximum table size
            }

        }
        return max;

    }
    public static void main(String[] args) {
        int[] nums = {2,1,1,3,2,3};
        System.out.println(maxNumbersOnTable(nums));
    }
    

    
}
