package com.config;

import com.bean.Address;
import com.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFile {
    @Bean
    public Address address(){
        Address add= new Address(100,"pubjab",252525);
        return add;
    }
@Bean
    public Student student(){
        Student stu= new Student("amit",101,address());
        return stu;
}

}
