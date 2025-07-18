public class interning {
    public static void main(String[] args) {
        String s="Hello"; //change string to 'Heylo'
        // String x="Hello";
        // x="Mello";  //s=?
        // System.out.println(x);
        //2-> 'y'
        
        s=s.substring(0,2) +'y' + s.substring(3);
        System.out.println(s);


    }
    
}
