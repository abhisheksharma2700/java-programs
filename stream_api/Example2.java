
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list= List.of(1,2,3,4,5);
        // this list is immutable
        List<Integer> list2= Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream=list.stream();
        List<Integer> newlist= stream.filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(newlist);






    }
}
