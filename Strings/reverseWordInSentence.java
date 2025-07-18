public class reverseWordInSentence {
    public static void main(String[] args) {
        String str ="I am a college student";
        String ans="";  //make an empty string 
        //Create another empty string using StringBuilder
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){ //to traverse entire string
            char ch =str.charAt(i);
            //if it is 1 letter then simply add to string builder
            if (ch !=' ') { //if char is not equal to space then add space there
                sb.append(ch);
            //if there is a space
            }else{   //char == ' '
                sb.reverse();  //the word is reversed 
                ans += sb;     //added the word to string along with a space
                ans += " ";
                sb.delete(0, sb.length());  //delete the current word to add the next word
                // sb = new StringBuilder(""); to produce a new empty string
            }
        }
        sb.reverse();  //for the last word because there is no space after it for it to execute else cond
        ans += sb;
        System.out.println(ans);
    }
    
}
