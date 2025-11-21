import java.util.*;
@FunctionalInterface
interface MultipleParameters{

    public long show(long a,long b,long c);
}


public class Example5 {
    public static void main(String[]args){
        MultipleParameters m= (a,b,c)->
        {
            return (a +b +c )/3;
        };
        double average= m.show(12,33,44);
        System.out.println("average is "+ average);
    }
}
