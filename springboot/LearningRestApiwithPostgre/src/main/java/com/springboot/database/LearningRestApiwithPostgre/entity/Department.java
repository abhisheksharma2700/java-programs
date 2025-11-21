package com.springboot.database.LearningRestApiwithPostgre.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Department {
    @Id
    private int id;
    private int dept_name;
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<Student>studentList= new ArrayList<>();
}
