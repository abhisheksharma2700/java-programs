package com.mainclass;

import com.beanclass.Student;
import com.configclass.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
        // Use AnnotationConfigApplicationContext for Java config
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // Get the bean
        Student student = context.getBean(Student.class);

        student.display();
    }
}
