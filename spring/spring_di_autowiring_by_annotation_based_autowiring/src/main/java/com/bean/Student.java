package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private String name;
    private int roll_no;
    @Autowired
   // @Qualifier("address2")// Used when we give different varibles names in both classes , then @Qualifier helps @autowired to which di or bean its wants by particuler name of method
    // if the name of student class Address varible and Address class method name are same then we don't need @Qalifier annotation
    private Address address2;
    @Autowired
    private Subject subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public Address getAddress() {
        return address2;
    }

    public void setAddress(Address address) {
        this.address2 = address;
    }
    public void display(){
        System.out.println("name: "+name);
        System.out.println("roll_no: "+roll_no);
        System.out.println("address: "+address2);
        System.out.println("subject: "+subject);
    }
}
