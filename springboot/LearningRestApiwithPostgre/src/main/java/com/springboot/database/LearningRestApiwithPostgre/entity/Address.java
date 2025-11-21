package com.springboot.database.LearningRestApiwithPostgre.entity;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    private Long address_id;
    private String street;
    private String city;
    private int pincode;
    @OneToOne(mappedBy = "address")
    private Student student;

    public Address( String street, String city, int pincode, Student student) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
        this.student = student;
    }
    public Address(){

    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
