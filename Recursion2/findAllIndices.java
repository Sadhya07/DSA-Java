package Recursion2;

import java.util.ArrayList;


public class findAllIndices {
    
     /*arr-> 4,4,3,4
     target->4
     ans(arraylist) ->{0,1,3}
     */
    static ArrayList<Integer> allIndices(int[]a , int n, int target, int idx){
        ArrayList<Integer>ans=new ArrayList<>();
        //base case
        if (idx>=n) {
            return ans;  //returns empty arraylist
        }
   
        //self work
        if (a[idx]== target) {  //ans->{0}
            ans.add(idx);
        }
        //recursive work 
        ArrayList<Integer> smallAns =allIndices(a, n, target, idx+1);   //smallAns={1,3}
        ans.addAll(smallAns);
        return ans;

    }


 
    public static void main(String[] args) {
    int[] a={1,2,4,5,6,7};
    int target=4;
    int n=a.length;

    ArrayList<Integer> ans= allIndices(a, n, target, 0);
    for(Integer i: ans){
        System.out.println(i);
    }

}
}
