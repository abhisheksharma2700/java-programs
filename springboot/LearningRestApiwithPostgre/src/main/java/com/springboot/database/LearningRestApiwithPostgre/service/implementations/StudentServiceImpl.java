package com.springboot.database.LearningRestApiwithPostgre.service.implementations;


import com.springboot.database.LearningRestApiwithPostgre.entity.Student;
import com.springboot.database.LearningRestApiwithPostgre.dto.AddStudentRequestDto;
import com.springboot.database.LearningRestApiwithPostgre.dto.StudentDto;
import com.springboot.database.LearningRestApiwithPostgre.repository.StudentRepository;
import com.springboot.database.LearningRestApiwithPostgre.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;


    public StudentServiceImpl(StudentRepository studentRepository,ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper=modelMapper;
    }



//    @Override
//    public List<StudentDto> getAllStudents() {
//        List<Student> students=studentRepository.findAll();
//        List<StudentDto> studentDtoList= students
//                .stream()
//                .map(student -> new StudentDto(student.getId(),student.getName(),student.getEmail()))
//                .toList();
//        return studentDtoList;
//
//    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student= studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Student not found with:"+id));
        return  modelMapper.map(student,StudentDto.class);


    }

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
        Student newStudent= modelMapper.map(addStudentRequestDto,Student.class);
        Student student= studentRepository.save(newStudent);
        return modelMapper.map(student,StudentDto.class);
    }
    @Override
    public void deleteStudentById(Long id) {
        if(studentRepository.existsById(id)){
            studentRepository.deleteById(id);
            System.out.println("student deleted successfully");


        }else{
            System.out.println("Student not found with this id: "+id);
        }

    }

    @Override
    public StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto) {
        Student updateStudent= studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("no student found with this id:"+id));
        modelMapper.map(addStudentRequestDto,updateStudent);
        updateStudent= studentRepository.save(updateStudent);
        return modelMapper.map(updateStudent,StudentDto.class);
    }

    @Override
    public StudentDto updatePartialStudent(Long id, Map<String, Object> updates) {
        Student updatePartialStudent= studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("no student found with this id:"+id));
        updates.forEach((field,value) ->{
            switch (field){
                case "name":updatePartialStudent.setName((String)value);
                break;
                case "email":updatePartialStudent.setEmail((String)value);
                break;
                default:
                    throw new IllegalArgumentException("Field is not supported");
            }

        });
        Student updatePartialStudent2= studentRepository.save(updatePartialStudent);
        return modelMapper.map(updatePartialStudent2,StudentDto.class);
    }


}
