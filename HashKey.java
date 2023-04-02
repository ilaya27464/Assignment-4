import java.util.HashMap;
import java.util.Set;

public class HashKey {
    public static void main(String[] args) {
        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(1, "Chess");
        m1.put(2, "Carrom");
        m1.put(3, "Cricket");
        Set<Integer> keys = m1.keySet();
        System.out.println("Set of Keys: " + keys);
    }
}