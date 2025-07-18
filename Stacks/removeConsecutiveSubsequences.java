package Stacks;
import java.util.Stack;

public class removeConsecutiveSubsequences {
    public static int[] remove(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(st.size() ==0 || st.peek() !=arr[i]){// if stack is empty or top element of stack is not equal to current element, then push the current element
                st.push(arr[i]);
            }
            else if(arr[i] == st.peek()){
                if(i ==n-1 || arr[i] != arr[i+1]) st.pop(); // if we are at the end of the array or next element is not equal to current element, then pop the top element
                //if arr[i] ==arr[i+1] then do nothing 
            }
        }
        int[] res = new int[st.size()];
        int m = res.length;
        for(int i=m-1; i>=0; i--){
            res[i] = st.pop();
        }
        return res; 
    }
    
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] res = remove(arr);
        for(int i=0; i< res.length; i++){ //print the result array
            System.out.print(res[i] +" ");
        }

    }
}
