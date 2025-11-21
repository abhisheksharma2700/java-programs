package com.main;
import com.classes.Student;


import com.resources.ConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(ConfigFile.class);
        //Student std= (Student) context.getBean("std1", Student.class);
       // Student std= context.getBean(Student.class);
        Student std1= (Student) context.getBean("stdOBJ1");
        std1.display();
        Student std2=(Student) context.getBean("stdOBJ2");
        std2.display();
    }
}
