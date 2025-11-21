package com.bean;

public class Student {
    private String name;
    private int roll_no;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public void setAddress(Address address){
        this.address=address;
    }
    public void display(){
        System.out.println("name: "+name);
        System.out.println("roll_no: "+roll_no);
        System.out.println("address: "+address);

    }
}
