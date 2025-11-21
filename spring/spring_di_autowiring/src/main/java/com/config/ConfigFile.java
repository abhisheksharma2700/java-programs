package com.config;

import com.bean.Address;
import com.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFile {
    @Bean
    public Address address(){
        Address add = new Address();
        add.setHouse_no(1);
        add.setCity("jaipur");
        add.setPincode(302020);
        return add;
    }
    @Bean
    public Student student(){
        Student stu= new Student();
        stu.setName("kamlesh");
        stu.setRoll_no(21);
        //stu.setAddress(address()); // manually dependency injection
        return stu;
    }


}
