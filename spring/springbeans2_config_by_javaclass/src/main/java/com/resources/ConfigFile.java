package com.resources;
import com.classes.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigFile {
    @Bean("stdOBJ1")
    public Student createstdBeanOBJ1(){
        Student std = new Student();
        std.setName("troy");
        std.setEmail("troy@gmail.com");
        std.setRoll_no(101);
        return std;
    }
    @Bean("stdOBJ2")
    public Student createstdBeanOBJ2(){
        Student std = new Student();
        std.setName("emma");
        std.setEmail("emma@gmail.com");
        std.setRoll_no(102);
        return std;
    }

}
