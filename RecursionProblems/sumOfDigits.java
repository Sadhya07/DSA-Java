import java.util.Scanner;
public class sumOfDigits {

    static int sod (int n){
     //base case
     if (n>=0 && n<=9) {
        return n;        
     }
    // //recursive work -> small Ans 
    // int smallAns= sod(n/10); //will return sum of first d-1 digits
    // //self work
    // return smallAns+ n%10; 

    return sod(n/10) +n%10;


    }
    public static void main(String[] args) {
        System.out.println(sod(2));
    } 
}