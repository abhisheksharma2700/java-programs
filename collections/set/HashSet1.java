package set;
import java.util.*;
public class HashSet1 {
    public static void main(String[]args){
        HashSet<String> h= new HashSet<String>();
        h.add("vikas");
        h.add("sahil");
        h.add("sonu");
        Iterator<String>i= h.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("");
        h.add("sonu");
        System.out.println(h);
    }
}
