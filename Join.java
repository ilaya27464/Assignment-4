import java.util.ArrayList;
import java.util.Iterator;

public class Join {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add("Say ");
        l1.add("Hello ");
        ArrayList l2=new ArrayList();
        l2.add("to ");
        l2.add("Everyone... ");
        l1.addAll(l2);
        Iterator itr=l1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}