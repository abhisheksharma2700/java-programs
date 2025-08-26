package set;
import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[]args){
        Set<String>s= new HashSet<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        System.out.println(s);
        System.out.println(s.remove("c"));
        System.out.println(s);
        System.out.println(s.remove("c"));


    }
}
