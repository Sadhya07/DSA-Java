public class countingDigits {

    static int cod(int n){
        if (n>=0&& n<=9) {
            return 1;
        }
        return cod(n/10) +1;
        // int count = cod(n/10) +1;
        // return count;
        
    }
    public static void main(String[] args) {
        System.out.println(cod(8));
    }
    
}
