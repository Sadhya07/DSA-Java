//Do practice question on finding palindrome in integers 

package Recursion2;
import java.util.Scanner;

public class Palindrome {

    

    static boolean isPalindrome(String s, int l,int r){
        if (l>=r) return true;
        return(s.charAt(l)== s.charAt(r) && isPalindrome(s, l+1, r-1)); //Compare first and last character by self work
                                                   //recursion compares middle characters
        }

    static boolean intPalindrome(int[] arr, int l,int r){
        if (l>=r) return true;
        return(arr[l]==arr[r] && intPalindrome(arr, l+1, r-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();
        for(int i=0; i<=num/10;i++){
            int arr=sc.nextInt();
        }
        int[] arr;
        // String s=sc.nextLine();
        // System.out.println(isPalindrome(s, 0, s.length()-1));
        System.out.println(intPalindrome(arr, 0, num)); 

    }
}
