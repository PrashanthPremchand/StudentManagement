package com.prashanthP.studentMangement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student addStudent(Student student){
        return studentRepository.addStudent(student);
    }
    public Student getStudent(int adminNo){
        return studentRepository.getStudent(adminNo);
    }
    public Student updateStudent(int adminNo, String name){
        return studentRepository.updateStudent(adminNo, name);
    }
    public boolean deleteStudent(int adminNo){
        return studentRepository.deleteStudent(adminNo);
    }
}
