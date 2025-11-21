package com.bean;

public class Address {
    private int house_no;
    private String city;
    private int pincode;
    public Address(int house_no,String city,int pincode){
        this.house_no=house_no;
        this.city=city;
        this.pincode=pincode;
    }
    public void display(){
        System.out.println(city);

    }
    @Override
    public String toString(){
        return house_no+" ,"+city+" ,"+pincode;

    }
}
