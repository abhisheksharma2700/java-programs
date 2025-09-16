import java.util.*;
import java.util.stream.Collectors;


public class Example6 {
    public static void main(String[] args) {
        List<Integer>list= new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(10);
        list.add(21);
        List<Integer>newlist= list.stream().map(e-> e * e).collect(Collectors.toList());
        System.out.println(newlist);

    }
}
