public class RotatedSortedArray {

    static int search(int[] a, int target){
        int n=a.length;
        int st=0 , end=n-1;
        int ans=-1;
        while (st<=end) {
            int mid=st + (end-st)/2;
            if (a[mid]==target) {
                return mid;
            }else if(a[mid]<a[end]){ //mid to end is sorted
                if (target >a[mid] && target<= a[end]) {
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }else{  //st to mid is sorted 
                if (target>= a[st] && target<a[mid]) {
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }

            }
        return ans;

    }

    //duplicate elements +nt in rotated sorted array
    static int search_dupl(int[] a, int target){
        int n=a.length;
        int st=0 , end=n-1;
        int ans=-1;
        while (st<=end) {
            int mid=st + (end-st)/2;
            if (a[mid]==target) {
                return mid;
            }else if(a[st]==a[mid] && a[end]==a[mid]){
                st++;   //eliminate duplicate values by shifting right or left
                end--;
            }
            else if(a[mid]<=a[end]){ //mid to end is sorted
                if (target >a[mid] && target<= a[end]) {
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }else{  //st to mid is sorted 
                if (target>= a[st] && target<a[mid]) {
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }

            }
        return -1;

    }

    public static void main(String[] args) {
        int []a ={1,1,1,2,2,3,1};
        int target=10;
       // System.out.println(search(a, target));
        System.out.println(search_dupl(a, target));
    }
}
