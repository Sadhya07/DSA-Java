package Stacks;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr ={1,3,2,1,8,6,3,4};
        int [] res = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            res[i] = -1; //initialize result array with -1
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i]){ //if next element is greater than current element
                    res[i] = arr[j]; //set the result array at index i to the next greater element
                    break; //break the loop as we found the next greater element
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
