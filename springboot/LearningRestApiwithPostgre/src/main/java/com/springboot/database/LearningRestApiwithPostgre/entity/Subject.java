package com.springboot.database.LearningRestApiwithPostgre.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    private Long id;
    private String subjectName;
    @ManyToMany(mappedBy = "subjects")
    private List<Student> Students= new ArrayList<>();

}
