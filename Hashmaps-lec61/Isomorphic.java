import java.util.*;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for(int i=0 ; i< s.length(); i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);
            if(mp.containsKey(sCh)){
                if((mp.get(sCh) != tCh)) {
                    return false; // If the mapping is inconsistent, return false
                }
            }else if(st.add(tCh)){
                return false; // If tCh is already mapped to a different character, return false
            }else{
                mp.put(sCh, tCh); // Create a new mapping
                st.add(tCh); // Add tCh to the set to track used characters
            }
        }
        return true; // If all characters are consistently mapped, return true

    }
    
}
