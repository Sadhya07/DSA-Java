package CollectionsFramework;
import java.util.*;

public class MapInterfaceExamples {
    public static void main(String[] args) {
       // HashMap<Integer,String> mp= new HashMap<>(); // HashMap does not maintain order
        // Map<Integer, String> mp = new LinkedHashMap<>(); // LinkedHashMap maintains insertion order
        TreeMap<Integer, String> mp = new TreeMap<>(); // TreeMap sorts the keys in natural order
        mp.put(3, "Aman");
        mp.put(2, "Riya");
        mp.put(1,"rohan");
        //Iterating over values in map
        for(var i:mp.keySet()){
            System.out.println(i);
        }
        //Iterate over key, value pairs
        for(var e : mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getValue());
        }

        mp.putIfAbsent(1,"yash" );// generally the value overrides prev value, but using putIfAbsent : val will not get override for same key
        System.out.println(mp);
        System.out.println(mp.entrySet());
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("rohan"));
        System.out.println(mp.get(3));
        System.out.println(mp.keySet());
        System.out.println(mp.values());

    
    }
    
}
