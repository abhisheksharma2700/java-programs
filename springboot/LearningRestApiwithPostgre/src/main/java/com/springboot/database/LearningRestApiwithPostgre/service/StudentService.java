package com.springboot.database.LearningRestApiwithPostgre.service;

import com.springboot.database.LearningRestApiwithPostgre.dto.AddStudentRequestDto;
import com.springboot.database.LearningRestApiwithPostgre.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {


    void deleteStudentById(Long id) ;

    //List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
