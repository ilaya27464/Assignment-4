import java.util.HashMap;
import java.util.Collection;

public class HashMapping{
    public static void main(String[] args) {
        HashMap<String,Integer> m1 = new HashMap<>();
        m1.put("Cricket",1);
        m1.put("Chess",3);
        m1.put("Carrom",2);
        Collection<Integer> values = m1.values();
        System.out.println(values);
    }
}