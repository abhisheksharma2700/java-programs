package com.bean;

public class Student {
    private String name;
    private int roll_no;
    private Address address;

  public Student(String name,int roll_no,Address address){
      this.name=name;
      this.roll_no=roll_no;
      this.address=address;
  }
    public void display(){
        System.out.println("name: "+name);
        System.out.println("roll_no: "+roll_no);
        System.out.println("address: "+address);

    }
}
