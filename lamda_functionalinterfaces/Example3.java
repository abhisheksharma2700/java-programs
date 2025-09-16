import java.util.*;
 interface Bird{
    public abstract void fly(String s);
}
public class Example3 {
    public static void main(String[]args){
        Bird b= (String value) ->{
            System.out.println("bird ");
        };
        b.fly("variable");

    }

}
