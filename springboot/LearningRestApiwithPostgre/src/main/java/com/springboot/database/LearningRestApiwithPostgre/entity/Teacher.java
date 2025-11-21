package com.springboot.database.LearningRestApiwithPostgre.entity;

import jakarta.persistence.*;
@Entity
public class Teacher {
    @Id
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    private Department department;

}
