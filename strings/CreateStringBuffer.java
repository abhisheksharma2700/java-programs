import java.util.*;
public class CreateStringBuffer {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("hello");
        System.out.println(s);
        s.append(" world");
        System.out.println(s);
        s.insert(5,"java");
        System.out.println(s);
        s.delete(5,10);
        System.out.println(s);
        
    }
}
