package set;
import java.util.*;

public class HashSet2 {
    public static void main(String[]args){
        HashSet<String> h= new HashSet<String>();
        h.add("fruits chart");
        h.add("apple");
        h.add("grapes");
        h.add("apple");
        h.add("mango");


        for(String s:h){
            System.out.println(s);
        }
        h.remove("fruits chart");
        System.out.println(h.clone());
        System.out.println(h);

        List<String>l= new ArrayList<>();
        l.add("ram");
        l.add("shyam");
         HashSet<String>h2= new HashSet<String>(l);
        System.out.println("this is our normal hashset");
         System.out.println(h);
        h.addAll(h2);
        System.out.println("after adding all elements from another hashset");
        System.out.println(h);
        h.addAll(l);
        System.out.println("after adding all elements from another list");
        System.out.println(h);



    }



}
