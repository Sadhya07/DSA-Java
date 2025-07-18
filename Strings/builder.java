public class builder {
    public static void main(String[] args) {
        // StringBuilder str= new StringBuilder("hello"); //we can alse give empty string whose capacity will be 16
        // System.out.println(str);
        // //hello -> mello
        // str.setCharAt(0, 'm'); //mello
        // System.out.println(str);
        // str.append(" world"); //mello world
        // System.out.println(str);
        // str.insert(2, 'y'); //meyllo world
        // System.out.println(str);
        // str.deleteCharAt(0);
        // System.out.println(str);
        StringBuilder sb= new StringBuilder("physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //physics
        // sb.delete(2,4); //2 and 3 delete
        // System.out.println(sb);
        System.out.println(sb.substring(3));

    }
    
}
