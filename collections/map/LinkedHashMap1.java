package map;
import java.util.*;
public class LinkedHashMap1 {
    public static void main(String[]args){
        Map<Integer,String> map= new LinkedHashMap<Integer,String>();
        map.put(1,"ram");
        map.put(2,"shyam");
        map.put(3,"sohan");
        map.put(4,"rohan");
        System.out.println(map);
        System.out.println("student records");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("student id: "+ entry.getKey()+" student name: "+entry.getKey());
        }
    }

}
