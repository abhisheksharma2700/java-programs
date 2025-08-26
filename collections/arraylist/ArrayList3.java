package arraylist;

import java.util.*;
public class ArrayList3
{
    public static void main(String[]args){
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("ramesh");
        arraylist.add("suresh");
        arraylist.add("kamlesh");
        // java used listIterator() to iterate in reverse order
        System.out.println("traversing throw listIterator");
        ListIterator<String> arraylist2= arraylist.listIterator(arraylist.size());
        while(arraylist2.hasPrevious()){
            String counter = arraylist2.previous();
            System.out.println(counter);
        }
        System.out.println("traversing through for loop");
        for(int i=0; i<arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }
        System.out.println("traversing through forEach method");
        arraylist.forEach(a->{
            System.out.println(a);

        });


    }
}
