public class StringCompression {
    public static void main(String[] args) {
        String str ="aaabbbcddeeee";
        String ans =""+ str.charAt(0); //char at 0 is always included - 1 letter then its counted
        int count =1;
        for(int i=1; i<str.length();i++){
            char curr =str.charAt(i);
            char prev =str.charAt(i-1); //compare curr with prev
            if (curr==prev) {
                count++;
            }else{
                if (count >1) ans+=count; //if count is 1 then not print 1
                count=1; //reset count for next letter
                ans+=count;                   
            }

        }
        if(count>1) ans +=count; //for last letter becoz next letter not there to compare
        System.out.println(ans);

    }
    
}
