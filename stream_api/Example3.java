import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;


public class Example3 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(30);
        list.add(2);
        list.add(40);
        list.add(50);
        List<Integer> newstream= list.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newstream);

    }
}
