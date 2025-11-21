package in.main;

import in.spring.firstexample.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String config="/in/beans/student.xml";
        ApplicationContext applicationcontext= new ClassPathXmlApplicationContext(config);

        Student student= (Student)applicationcontext.getBean("studentid");
        Student student1=(Student)applicationcontext.getBean("studentid2");
        student.display();
        student1.display();



    }
}
