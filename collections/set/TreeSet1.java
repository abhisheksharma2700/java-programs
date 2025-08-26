package set;
import java.util.*;

public class TreeSet1
{
    public static void main(String[]args)
    {
        TreeSet<String> t= new TreeSet<String>();
        t.add("e");
        t.add("d");
        t.add("c");
        t.add("b");
        t.add("a");
        Iterator i= t.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("traversing element in descending order ");
        Iterator it= t.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }}
