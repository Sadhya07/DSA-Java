

import java.util.*;

public class arraylist {

    public static class Arraylist{
        int [] arr= new int[2];
        int size =0;
        int idx = 0;
        public void add(int ele){
            if (size ==arr.length) {
                int[] brr = Arrays.copyOf(arr, arr.length*2); //created a new array with double length
                arr = brr; //reassigning the name of new array to original name
                 
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
        public void set(int idx, int val){
            arr[idx] = val;
        }


    }

    public static void main(String[] args) {
        //ArrayList<Integer> arr= new ArrayList<>();
        // arr.add(1);
        // arr.add(3);
        // arr.add(5);
        // arr.add(9);
        // arr.add(70);
        // System.out.println(arr.size());
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
        arr.add(3); //->array index out of bounds exception
        System.out.println(arr.size);
        arr.set(0,10);
    }
    
}
