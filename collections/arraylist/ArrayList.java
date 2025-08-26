package arraylist;

import java.util.*;
 class ArrayList2 {
    public static void main(String[]args){
        ArrayList<String>list= new ArrayList<String>();
        list.add("mango");
        list.add("grapes");
        list.add("banana");
        list.add("apple");
        for(String fruit:list){
            System.out.println(fruit);
        }
        System.out.println("sorted list");
        Collections.sort(list);
        for(String fruit:list){
            System.out.println(fruit);
        }
        ArrayList<Integer>num= new ArrayList<Integer>();
        num.add(5);
        num.add(3);
        num.add(4);
        num.add(2);
        num.add(1);
        Collections.sort(num);
        for(int count: num){
            System.out.println(count);
        }



    }
}
