package Recursion2;
public class sumOfElements {

    static int sumOfArray(int[] arr, int idx){
        //base case 
        if (idx==arr.length) {
            return 0;
        }
        //small problem
        int sum =sumOfArray(arr, idx+1);

        //self work 
        return sum + arr[idx];
        

    }

    public static void main(String[] args) {
        int[] arr={};
        System.out.println("The sum of the given array is: " +sumOfArray(arr, 0));



    }
    
}
