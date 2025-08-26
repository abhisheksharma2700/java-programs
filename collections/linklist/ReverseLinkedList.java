package linklist;

import java.util.*;

public class ReverseLinkedList {
    public static void main(String[]args){
        LinkedList<Integer>ll= new LinkedList<Integer>();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        System.out.println("iterate using for loop");
        for(int count :ll){
            System.out.println(count);
        }
        Iterator i= ll.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }



    }
}
