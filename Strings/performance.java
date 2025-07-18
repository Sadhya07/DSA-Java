public class performance {
    public static void main(String[] args) {
        String str="";
        for(int i=1; i<=10; i++){
            str= str+i;
        }
        // "" "1" "12".....55 operations take place to modify the string
        System.out.println(str);
    }
    
}
