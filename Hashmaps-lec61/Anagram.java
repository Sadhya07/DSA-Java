import java.util.HashMap;

public class Anagram {

    static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i =0; i< str.length(); i++){
            Character ch = str.charAt(i);
            if( !mp.containsKey(ch)){ //agar pehle se nhi hai toh add 1
                mp.put(ch,1);
            }else{ //if ch +nt already, update its value
                int currfreq = mp.get(ch);
                mp.put(ch, currfreq +1);
            }

        }
        return mp;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false; //agar length same nhi hai toh vaise hi anagrams nhi ho sakte
        HashMap<Character, Integer> mp = makeFreqMap(s);
        for(int i=0; i< t.length(); i++){
            Character ch = t.charAt(i);
            if( !mp.containsKey(ch)) return false;
            int currfreq = mp.get(ch);

        }
        //All values in mp should be 0 for s and t to be anagrams
        for(Integer i : mp.values()){
            if(i !=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Anagram anagram = new Anagram(); //made an object of the class to call the methods
        String s = "listen";
        String t = "silent";
        System.out.println(anagram.isAnagram(s, t)); // Output: true
    }
    

}
