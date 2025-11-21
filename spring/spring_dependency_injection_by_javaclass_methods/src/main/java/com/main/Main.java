package com.main;

import com.bean.Student;
import com.configfile.ConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ConfigFile.class);
        Student student= applicationContext.getBean(Student.class);
        student.display();

    }
}
