import java.util.HashSet;
public class hashset {

    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<String>();
        HashSet<String> h2 = new HashSet<String>();
        h1.add("Fruit");
        h1.add("Fig");
        h1.add("Apple");
        h1.add("Orange");
        h2.add("Fig");
        h2.add("Banana");
        h2.add("Grapes");
        System.out.println("Elements of first hash set: "+h1);
        System.out.println("Elements of second hash set: "+h2);
        if(h1.equals(h2))
        {
            System.out.println("Both the hash sets are equal.");
        }
        else {
            System.out.println("\nBoth hash-sets are not equal.\n");
            h1.removeAll(h2);
            h2.removeAll(h1);
            System.out.println("Difference between two HashSet: " + h1);
            System.out.println("Difference between two HashSet: " + h2);
        }

    }
}