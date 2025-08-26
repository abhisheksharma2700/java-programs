package arraylist;

import java.util.*;
public class Main{
    public static void main(String[]args){
        ArrayList<String>list= new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("grapes");
        System.out.println(list);
        Iterator i= list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}