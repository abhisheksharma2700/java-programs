package com.springboot.database.LearningRestApiwithPostgre.controller;


import com.springboot.database.LearningRestApiwithPostgre.dto.AddStudentRequestDto;
import com.springboot.database.LearningRestApiwithPostgre.dto.StudentDto;
import com.springboot.database.LearningRestApiwithPostgre.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

   /* @GetMapping("/")
    public StudentDto getStudent(){
        return new StudentDto(1l,"student1","student1@gmail.com");
    }

    */
//   @GetMapping
//   public List<StudentDto> getAllStudents(){
//       return studentService.getAllStudents();
//   }
   @GetMapping("/{id}")
   public StudentDto getStudentById(@PathVariable Long id){
       return studentService.getStudentById(id);
   }

   @PostMapping
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody @Valid AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));



    }
    @DeleteMapping("/{id}")
    public ResponseEntity<StudentDto> deleteStudent(@PathVariable Long id){
       studentService.deleteStudentById(id);
       return ResponseEntity.noContent().build();

    }
    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id, @RequestBody AddStudentRequestDto addStudentRequestDto ){
       return ResponseEntity.ok(studentService.updateStudent(id,addStudentRequestDto));

    }
    @PatchMapping("/{id}")
    public ResponseEntity<StudentDto>updatePartialStudent(@PathVariable Long id, @RequestBody Map<String,Object> updates){
       return ResponseEntity.ok(studentService.updatePartialStudent(id,updates));

    }
   // @PutMapping("/students")
   // public ResponseEntity<StudentDto>updateStudentWithAddress(@PathVariable Student student,@RequestBody AddStudentRequestDto addStudentRequestDto ){
       //return ResponseEntity.ok(studentService.updateStudent())
    //}

}
