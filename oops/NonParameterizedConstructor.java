package oops;
 class Marks {
    

     String subject;
     int marks;

    public void getMarks(){
        System.out.println("the name of subject is "+ this.subject);
        System.out.println("the marks obtained by student "+ this.marks);

    }
}
    
    class Student{
    String name;
    int age;
    Student(){
        System.out.println("Non parameterized constructor is called");
    }

public void getInfo(){
    System.out.println("the name of student: " +this.name);
    System.out.println("the age of student is " +this.age);

}
}
public class NonParameterizedConstructor{
    public static void main(String[]args){
        Student s1 = new Student();
        s1.name = "abhi";
        s1.age = 19;
        s1.getInfo();
        Student s2= new Student();
        s2.name= "Student 2";
        s2.age= 18;
        s2.getInfo();
        Marks m1 = new Marks();
        m1.subject= "hindi";
        m1.marks= 78;
        m1.getMarks();
        
    }
}

