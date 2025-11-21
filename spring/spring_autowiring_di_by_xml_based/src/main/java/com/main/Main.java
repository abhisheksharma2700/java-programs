package com.main;

import com.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("/Configfile2.xml");
        Student student= (Student) context.getBean("student_id");
        student.display();

    }
}
