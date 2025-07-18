package Recursion2;

public class recursionProblems {
    //finds the index of the last occurence of the target
    static int findLastIndex(int[]a , int target , int idx){
        //base case
        if (idx<0) {
        return -1;
        }
        //self work
        if (a[idx]==target)  return idx;
        
        //recursive work
        return findLastIndex(a, target, idx-1);
         }

    //checks if the array is sorted or not 
    static boolean isSorted(int[] a,int n, int idx){
        //base case
        if(idx==n-1){
            return true;
        }
       
        //self work
        if (a[idx] > a[idx+1]) {
           return false;            
        }
         //recursive work 
        return isSorted(a,a.length, idx+1);
        } 
    


    public static void main(String[] args) {
        int[] a={2,3,4,5,7,9};
        int n=a.length;
        int target =14;
        // if(isSorted(a, a.length, 0)){
        //     System.out.println("Array is sorted");
        // }else{
        //     System.out.println("Array not sorted");
        // }
        System.out.println(findLastIndex(a,target,n-1 ));


    }
    
}
