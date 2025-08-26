package set;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSet3 {
    public static void main(String[]args){
        TreeSet<String> t= new TreeSet<String>();
        t.add("a");
        t.add("b");
        t.add("c");
        t.add("d");
        t.add("e");
        System.out.println(t);
        System.out.println("iterating the treeset");
        Iterator<String> i= t.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("iterating the treeset in desecending order");
        Iterator<String>I2= t.descendingIterator();
        while(I2.hasNext()){
            System.out.println(I2.next());
        }
        System.out.println("for dirtectly print treeset in descending order without iterating we directly use"+t.descendingSet());
        System.out.println("head set "+ t.headSet("d",true));
        System.out.println("head set without using true"+t.headSet("d"));
        System.out.println("sub set"+ t.subSet("a",false,"c",true));
        System.out.println("sub set without using true or false"+t.subSet("a","d"));
        System.out.println("tail set "+t.tailSet("c"));
        System.out.println("tail set with using false "+t.tailSet("c",false));


    }
}
