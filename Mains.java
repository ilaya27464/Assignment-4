import java.util.LinkedList;

public class Mains{

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Say");
        list.add("Hii");
        list.add("To");
        list.add("Everyone");
        String e="HII..";
        if (list.contains(e)) {
            System.out.println("The element '"+e+"' exists.");
        }
        else {
            System.out.println("Element does not exist.");
        }
    }
}