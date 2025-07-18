package Recursion2;

public class Search {
     static void findAllIndices(int[] a, int n , int target, int idx ){  //1,2,3,2,2,5
        //base case
        if (idx>=n) {
            return;
        }
        //self work
        if (a[idx]==target) {
            System.out.println(idx);
        }
        findAllIndices(a, n, target, idx+1);




     }
     
     //return index of target if target present in array, otherwise return -1
    static int findFirstIndex(int[] a, int target,int n, int idx){
        //base case 
        if (idx==a.length-1) {
            return -1;
        }
        //self work

        if (a[idx]==target) return idx;
        //recursive work
        return findFirstIndex(a, target, n, idx+1);

      
    }
    //returns true or false- based on existence
    static boolean search(int[] a, int target,int n, int idx){
        //base case 
        if (idx==a.length) {
            return false;
        }
        //self work

        if (a[idx]==target) return true;
        //recursive work
        return search(a, target, n, idx+1);

        // if (search(a, target,n, idx+1)){ ->function will always return a boolean value 
        //     return true;.
        // }
      
    }


    public static void main(String[] args) {
        int[] a ={1,2,3,2,2,5};
        int target =2;
        findAllIndices(a,a.length, target,0);  //1,3,4

        //System.out.println(findFirstIndex(a, target, a.length,0));
        // if (search(a,target,a.length,0)) {
        //     System.out.println("Yes");
            
        // }
        // else{
        //     System.out.println("No");

        // }

    
    
    
    
    }
    
}
