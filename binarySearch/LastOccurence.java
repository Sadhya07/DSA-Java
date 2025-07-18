public class LastOccurence {
  
    static int lastOcc(int[]a , int x){
        int n=a.length;
        int st=0, end=n-1;
        int lo=-1;
        while (st<=end) {
            int mid=(st+end)/2;
            if (x==a[mid]) {
                lo=mid;
                st=mid+1;
            }else if(x< a[mid]){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,5,5,5,6,7,8,9};
        int x=5;
        System.out.println(lastOcc(a, x));

    }
}
