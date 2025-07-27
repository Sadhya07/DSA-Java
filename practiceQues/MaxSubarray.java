package practiceQues;
import java.util.Arrays;

public class MaxSubarray {
    




    public static int[] maxSubArrayWithSubarray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // extract the subarray
        int[] subarray = Arrays.copyOfRange(nums, start, end + 1);
        System.out.println("Subarray with max sum: " + Arrays.toString(subarray));
        System.out.println("Maximum Sum: " + maxSum);

        return subarray;  // if you want to return both, make a wrapper class or use Pair
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArrayWithSubarray(nums);
    
    }

}

