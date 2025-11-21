package com.config;

import com.bean.Address;
import com.bean.Student;
import com.bean.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigFile {
    @Bean
    public Address address1(){
        Address add = new Address();
        add.setHouse_no(1);
        add.setCity("jaipur");
        add.setPincode(302020);
        return add;
    }
    @Bean
    public Address address2(){
        Address add = new Address();
        add.setHouse_no(1);
        add.setCity("bhopal");
        add.setPincode(202020);
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
    @Bean
    public Subject subject(){
        Subject sub= new Subject();
        List<String> subjects_list= new ArrayList<>();
        subjects_list.add("java");
        subjects_list.add("python");
        subjects_list.add("c++");
        sub.setList(subjects_list);
        return sub;
    }


}
