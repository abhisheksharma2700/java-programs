package arraylist;

import java.util.*;

class Student{
    String name, subject;
    int roll_no;
    Student(String name,int roll_no,String subject) {
        this.name = name;
        this.roll_no = roll_no;
        this.subject = subject;
        //System.out.println(name+" "+roll_no+ " "+subject);
    }


}



public class ClassesInArrayList
{public static void main(String[]args){
    Student s1= new Student("sohan",11, "maths");
    Student s2= new Student("rohan",12, "english");
    Student s3= new Student("mohan",21, "History");
    ArrayList<Student> s = new ArrayList<Student>();
    s.add(s1);
    s.add(s2);
    s.add(s3);
    Iterator i= s.iterator();
    while(i.hasNext()) {
        Student st = (Student) i.next();
        System.out.println("name:" + st.name + " " + "roll no:" + st.roll_no + " " + "subject:" + st.subject);
    }








}
}
