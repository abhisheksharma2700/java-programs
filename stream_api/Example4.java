import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collector;


public class Example4 {
    public static void main(String[] args) {
        String arr[]={"mohan","mohit","sohan","sumit"};
        Stream<String> stream1= Stream.of(arr);
        System.out.println("we can also create stream to process the arrays");
        stream1.forEach(e -> System.out.println(e));




    }
}

