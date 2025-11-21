package com.example.config;

import com.example.beans.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public CommandLineRunner myCommandLineRunner(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                myStudent1().display();
                System.out.println("------");
                myStudent2().display();

            }
        };
    }
    @Bean
    public Student myStudent1(){
        return new Student("name1",1,18);
    }
    @Bean
    public Student myStudent2(){
        return new Student("name2",2,20);
    }



}
