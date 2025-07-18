public class Power {
    // static int pow(int p,int q){ //p^q
    //     if (q==0) return 1;    //base case
    //     return pow(p, q-1) *p;   //p^q-1 *p
    //     }
    static int pow(int p,int q){
        if (q==0) return 1;
        int smallPow = pow(p, q/2);
        if(q%2 == 0){  //even power
            return smallPow * smallPow;
            // return pow(p,q/2) * pow(p, q/2);       
        }
        return p * smallPow * smallPow;   //odd

        
        
    }
    


    public static void main(String[] args) {
        System.out.println(pow(2,7));
    }
    
}
