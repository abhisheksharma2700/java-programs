package linklist;
import java.util.*;
class Student {
    String name;
    int age;

    void show(int length, String name, int width) {
        int area = length * width;
        System.out.println("area of " + name + " " + area);


    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
}



public class LinkedList3 {
    public static void main(String[]args){
        //Student s= new Student();
       // s.show(10,"A",10);
        LinkedList<Student> l= new LinkedList<Student>();
        Student s1= new Student("jass",20);
        Student s2= new Student("gill",19);
        l.add(s1);
        l.add(s2);
        System.out.println("iterating list by using for each loop");
        for(Student  s:l){
            System.out.println(s.name+" "+s.age);
        }

    }
}
