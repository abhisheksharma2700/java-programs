import java.util.*;
public class LamdaExample1 {
    public static void main(String[]args){
        List<Integer> l= Arrays.asList(1,2,3,4,3,4);
        System.out.println("printing list by using forEach with lamda function");
        l.forEach(list -> System.out.print(list +" "));



    }
}
