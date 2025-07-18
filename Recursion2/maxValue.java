package Recursion2;


public class maxValue {
    static int maxInArray(int[] arr,int idx){
        //base case
        if (idx==arr.length-1) {
            return arr[idx];           
        }

        //small problem ->idx+1 to end of array ->max ->recursive
        int smallAns = maxInArray(arr, idx+1);
    
    //self work and final ans
    return Math.max(arr[idx],smallAns);
    }
    static void printArray(int []arr, int idx){
        if(idx == arr.length){
            return;
        }
        //self work
        System.out.println(arr[idx]);  //5
        //recursive work - sub problem 
        printArray(arr, idx +1);  //6,7,8 
    }

    public static void main(String[] args) {
        int [] arr={5 ,16, 27, 8, 9};
        //printArray(arr, 0);
        System.out.println(maxInArray(arr, 0));
    }

    
}
