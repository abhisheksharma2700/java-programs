package oops;
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name= name;
        this.age=age;
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    
}
    public class CopyConstructor{

    public static void main(String[]args){
        Student s1= new Student("abhi",20);
        Student s2= new Student(s1);
        System.out.println("by parameterized constructor  "+ s1.name+"," +s1.age);
        System.out.println("by copy constructor  "+s2.name+","+s2.age);

    
     
    }
}
    