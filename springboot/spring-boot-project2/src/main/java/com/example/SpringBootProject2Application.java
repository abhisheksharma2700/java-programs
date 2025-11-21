package com.example;

import com.example.beans.Student;
import com.example.myclass.MyClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProject2Application implements CommandLineRunner {

	public static void main(String[] args) {

        SpringApplication.run(SpringBootProject2Application.class, args);
	}
    @Bean
    public MyClass myClass(){
        return new MyClass();
    }
    @Bean
    public Student myStudent(){
        return new Student("student1",1,18);
    }


    @Override
    public void run(String... args) throws Exception {
        myClass().printMessage("name");
        myStudent().display();



    }
}
