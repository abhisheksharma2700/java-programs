import java.util.*;
class Example{

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer > list2= new ArrayList<Integer>();
        for(int e:list){
            if(e%2==0){

                list2.add(e);
            }

        }
        System.out.println(list);
        System.out.println("getting even numbers from list without using stream-api");
        System.out.println(list2);
    }
}