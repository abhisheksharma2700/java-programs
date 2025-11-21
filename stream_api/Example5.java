import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class Example5 {
    public static void main(String[] args) {
        List<String>list= List.of("ankit","aman","aarav","sumit");
        List<String> stream= list.stream().filter(e-> e.startsWith("a")).collect(Collectors.toList());
        System.out.println(stream);
    }
}
