package set;
import java.util.*;

public class TreeSet2 {
    public static void main(String[]args){
        TreeSet<Integer> t=new TreeSet<Integer>();
        t.add(21);
        t.add(5);
        t.add(50);
        t.add(55);
        System.out.println("smallest digit"+t.pollFirst());
        System.out.println("largest digit"+ t.pollLast());

    }
}
