import java.util.*;

public class Key {
    public static void main(String[] args) {
        TreeMap<Integer, String> t1 = new TreeMap<>();
        t1.put(1, "One");
        t1.put(2, "Two");
        t1.put(3, "Three");
        t1.put(4, "Four");
        int key = 9;
        Map.Entry<Integer,String> entry = t1.ceilingEntry(key);
        if(entry != null){
            System.out.println("the least key greater than or equal to " + key + " is : " + entry);
        } else
        {
            System.out.println("The key is Not Available.");
        }
    }
}