package map;
import java.util.*;

public class Example1 {
    public static void main(String[]args){
        Map m= new HashMap();
        m.put(1,"add");
        m.put(2,"add2");
        m.put(3,"add3");
        System.out.println(m);
        System.out.println("to iterate the hashmap");
        Set set= m.entrySet();
        Iterator i= set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());

        }


    }
}
