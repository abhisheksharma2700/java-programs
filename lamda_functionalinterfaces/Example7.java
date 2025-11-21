import java.util.*;

public class Example7 {
    public static void main(String[]args){
        List<String> l= new ArrayList<String>();
        l.add("ram");
        l.add("shyam");
        l.add("mohan");

        l.forEach(
                (d)-> System.out.println(d)
                );
    }
}
