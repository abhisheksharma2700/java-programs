package com.springboot.database.LearningRestApiwithPostgre.repository;

import com.springboot.database.LearningRestApiwithPostgre.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
