import java.util.*;
interface Six{
    public abstract int show(int a, int b);
}



public class Example6 {
    public static void main(String[]args){
        Six s= (a,b)-> (a+b);
        System.out.println(s.show(10,20));


        Six s2=(int a,int b)->{
            return (a+b);

        };
        System.out.println(s2.show(100,200));
    }

}
