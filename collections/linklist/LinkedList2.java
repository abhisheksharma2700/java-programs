
package linklist;
import java.util.*;

public class LinkedList2 {
    public static void main(String[]args){
        LinkedList<String>ll= new LinkedList<String>();
        ll.addLast("apple");
        ll.addFirst("grapes");
        ll.add("mango");
        ll.addLast("banana");
        ll.add(2,"orange");
        System.out.println("iterate elements by using Iterator");
        Iterator i= ll.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        ll.remove(4);
        System.out.println("last element is removed"+ll);
        ll.removeFirst();
        System.out.println("first element also removed"+ll);

        System.out.println("added apple and mango elements form another list");
        LinkedList<String>l= new LinkedList<String>();
        l.add("apple");
        l.add("mango");
        ll.addAll(l);
        System.out.println(ll);
        //ll.removeAll(l);
        //System.out.println("removing all elements from another elements");
        //System.out.println(ll);

        System.out.println("removing last element");
        ll.removeLast();
        System.out.println(ll);
        System.out.println("deleting the last occurenece elements from list");
        ll.removeLastOccurrence("apple");
        System.out.println(ll);
        ll.removeFirstOccurrence("apple");
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);






    }
}
