import java.util.*;
interface Sayable{
    public String say(String name);
}

public class Example4 {
    public static void main(String[]args){
        Sayable s=(name)->{
            System.out.println("lamda expressions with one parameter");
            return "hello ,"+name;
        };
        System.out.println(s.say("sonu"));
        Sayable s1=name->{
            return "hello, "+name;
        };
        System.out.println(s1.say("monu"));
    }

}
