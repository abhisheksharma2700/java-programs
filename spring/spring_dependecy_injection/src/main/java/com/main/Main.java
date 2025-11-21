package com.main;

import com.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        String config_xml_location="applicationcontext.xml";
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationcontext.xml");
          Student student= (Student)context.getBean("stdid");
          student.display();


    }
}
