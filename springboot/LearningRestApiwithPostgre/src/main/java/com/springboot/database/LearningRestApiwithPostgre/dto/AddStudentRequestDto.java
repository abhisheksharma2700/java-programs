package com.springboot.database.LearningRestApiwithPostgre.dto;

import com.springboot.database.LearningRestApiwithPostgre.entity.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class AddStudentRequestDto {
    @NotBlank(message = "Name is required")
    @Size(min = 3,max = 30,message = "name should be minimum of 3 letters and maximum of 30 letters")
    private String name;
    @Email
    @NotBlank(message = "Email is required")
    private String email;
    private Address address;

    public AddStudentRequestDto(){}

    public AddStudentRequestDto( String name, String email,Address address) {
        this.name = name;
        this.email = email;
        this.address=address;


    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

