import java.util.*;
interface Showable{
    public int show();
}
public class LamdaExample2 {
    public static void main(String[]args){
        Showable s= () ->{
            System.out.println("show method have no parameters");
             return 0;

        };
        s.show();
        System.out.println(s.show());

    }

}
