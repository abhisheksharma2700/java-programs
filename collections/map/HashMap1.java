package map;
import java.util.*;

public class HashMap1 {
    public static void main(String[]args){
        Map<Integer,String>m= new HashMap<Integer,String>();
        m.put(1,"student 1");
        m.put(2,"student 2");
        m.put(3,"student 3");
        System.out.println(m);
        int studentidtofind=2;
        String studentname=m.get(studentidtofind);
        if(studentname!=null){
            System.out.println("student with id"+studentidtofind+" "+studentname);
        }
        else {
            System.out.println("student with id"+ studentidtofind+" "+"student not found");
        }

    }
}
