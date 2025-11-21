package com.beanclass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("jack")
    private String name;
    @Value("1")
    private int roll_no;
    @Value("50")
    private float marks ;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public int getRoll_no(){
        return roll_no;
    }
    public void setRoll_no(int roll_no){
        this.roll_no=roll_no;
    }
    public float getMarks(){
        return marks;
    }

    public void setMarks(float marks1) {
        marks=marks1;
    }
    public void display(){
        System.out.println("name: "+name);
        System.out.println("roll_no: "+roll_no);
        System.out.println("marks: "+marks);
    }
}

