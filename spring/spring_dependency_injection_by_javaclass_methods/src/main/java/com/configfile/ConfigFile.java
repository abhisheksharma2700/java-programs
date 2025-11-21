package com.configfile;

import com.bean.Address;
import com.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFile {
    @Bean
    public Address address(){
        Address add= new Address();
        add.setHouse_no(87);
        add.setCity("jaipur");
        add.setPincode(302022);
        return add;
    }
    @Bean
    public Student student(){
        Student stu= new Student();
        stu.setName("amit");
        stu.setRoll_no(11);
        stu.setAddress(address());
        return stu;

    }
}
