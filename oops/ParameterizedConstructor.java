package oops;
class Student {
    String name;
    String subject;
    int marks;
    
    Student(String name, String subject, int marks){
         this.name= name;
         this.subject = subject;
        this.marks = marks;
        System.out.println("The name of the student is "+ this.name);
        System.out.println("The name of Subject is "+this.subject);
        System.out.println("the marks of student in "+subject+ " are " +this.marks);


    }
}
public  class ParameterizedConstructor{
    public static void main(String[] args) {
        Student s1= new Student("amit","maths", 40);
    }

}
