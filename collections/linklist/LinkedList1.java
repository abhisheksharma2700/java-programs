package linklist;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[]args){
        LinkedList<String>ll= new LinkedList<String>();
        ll.add("ram");
        ll.add("shyam");
        ll.add("ramesh");
        System.out.println(ll);
        ll.addFirst("suresh");
        ll.addLast("suresh");
        System.out.println(ll);
        LinkedList<String> l= new LinkedList<String>();
        l.addAll(ll);
        System.out.println(l);
        l.add(2,"geeta");
        System.out.println(l);
    }
}
