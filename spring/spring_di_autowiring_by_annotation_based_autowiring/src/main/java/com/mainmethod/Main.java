package com.mainmethod;

import com.bean.Student;
import com.config.ConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(ConfigFile.class);
        Student student=context.getBean(Student.class);
        student.display();
    }
}
