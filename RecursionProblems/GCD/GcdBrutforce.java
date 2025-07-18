import java.util.Scanner;

public class GcdBrutforce{
    static int gcd(int x, int y){
        int min =Math.min(x, y);
        int max=0;
        for(int i=min ;i>=1; i--){
            if (x % i==0 && y % i==0 && max <i) {
                max =i;
            }
        }
        return max;
    }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int x=sc.nextInt();
    int y =sc.nextInt();
    System.out.println(gcd(x, y));
   }
}