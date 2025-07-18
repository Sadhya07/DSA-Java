import java.util.Scanner;

public class SeriesSum{

    //main question-alternate series sum 
    static int seriesSum2(int n){
        if (n==0) return 0;

        if (n%2==0) {
            return seriesSum2(n-1) -n;     // even numbers get subtr
        }else{      // odd num
            return seriesSum2(n-1) + n;
        }

    }
    static int seriesSum1(int n){
        if (n==0) {
            return 0;
        }
        return seriesSum1(n-1) + n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       // System.out.println(seriesSum1(n));
       System.out.println(seriesSum2(n));
    }

    
}
