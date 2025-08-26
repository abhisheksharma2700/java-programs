package arraylist;

import java.util.*;

public class ArrayListOperations {
    public static void main(String[]args){
        ArrayList<String> fruit= new ArrayList<String>();
        fruit.add("apple");
        fruit.add("grapes");
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("apple");
        System.out.println("inital arraylist");
        System.out.println(fruit);
        System.out.println("we can sort in arraylist by using Collections.sort() ");
        Collections.sort(fruit);
        System.out.println(fruit);
        System.out.println("printing list item by get method");
        System.out.println(fruit.get(0));
        System.out.println("change element in list by set method and iterate it by for-each loop");
        fruit.set(0,"orange");

        for(String count:fruit){
            System.out.println(count);
        }
        System.out.println("removing elements by using index or name ");
        fruit.remove(4);
        System.out.println("iterating list by using for-each method");
        fruit.forEach(a-> {
            System.out.println(a);
        });
        ArrayList<String> ar= new ArrayList<String>(10);
        System.out.println("size of arraylist ar"+ar.size());
        System.out.println("is arraylist isEmpty();"+ar.isEmpty());
        System.out.println("for adding one arraylist element we can use addAll()method"+ar.addAll(fruit));
        System.out.println("iterating ar arraylist elements using forEachRemaining");
        Iterator ir= ar.iterator();
        ir.forEachRemaining(a->{
            System.out.println(a);

        });
        System.out.println("removing \"banana\" from ar:"+ar.remove("banana") );
        System.out.println("adding an different element in ar arraylist"+ar.add("name"));
        System.out.println("to remove different elements on two strings we can use retainAll() method beacause it delete different elements and only left same elements on different arraylist we can use \"retainAll() method\" "+ar.retainAll(fruit));
        System.out.println("iterate arraylist by using Listiterator interface");
        ListIterator<String> l=  ar.listIterator(ar.size());
        while(l.hasPrevious()){
            String s= l.previous();
            System.out.println(s);
        }










    }
}
