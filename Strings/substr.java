public class substr {
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(str.substring(0,2));
        System.out.println(str.substring(2));

        String s="physics";
        for(int j=2; j<4; j++){
            System.out.print(s.substring(j));  //ysicssics
        }

        


    }
    
}
