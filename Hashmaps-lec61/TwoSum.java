import java.util.*;

public class TwoSum {
    // public int[] twosum(int[] nums, int target){
    //     int n = nums.length; //O(n^2)
    //     int [] ans = {-1}; //Initialize with -1 to handle cases where no solution is found
    //     for(int i =0; i< n; i++){
    //         for(int j = i+1; j<n ; j++){
    //             if(nums[j] == target - nums[i]){
    //                 ans = new int[]{i,j}; //Found the pair -assign a new array to the existing variable
    //                 return ans;
    //             }
    //         }
    //     }
    //     return ans; //If no pair found, return the initialized value
    // }
    public int[] twosum (int[] nums, int target){
        int n = nums.length;
        int[] ans ={-1};
        //value, index
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n ; i++){
            int partner = target - nums[i];
            if(mp.containsKey(partner)){ //agar partner i.e target - num +nt hai toh give their indices as ans
                ans = new int[]{i, mp.get(partner)}; 
                return ans;
            }
            mp.put(nums[i], i); //put the current number and its index in the map
        }
        return ans;
    }
}
