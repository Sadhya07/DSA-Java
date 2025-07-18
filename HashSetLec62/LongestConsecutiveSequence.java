
package HashSetLec62;
import java.util.*;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        for(int num: nums) st.add(num);
        int maxStreak =0;

        for(int num : st){
            if(!st.contains(num-1)){ //if num-1 is not present, then num is the start of a sequence
                int currNum = num;
                int currStreak = 1;//length of the current consecutive sequence starting with num

                while(st.contains(currNum + 1)){ //check for next consecutive numbers
                    currNum++;
                    currStreak++;
                }
                maxStreak = Math.max(maxStreak, currStreak); //update maxStreak if current streak is longer

            }
        }
        return maxStreak;

    }
    
}
