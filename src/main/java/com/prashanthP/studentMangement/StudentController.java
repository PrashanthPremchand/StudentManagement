package com.prashanthP.studentMangement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    Map<Integer, Student> mapDB = new HashMap<>();
    //adding student
    @PostMapping("/add_student")
    public ResponseEntity addStudent(@RequestBody Student student){
        Student student1 = studentService.addStudent(student);
        if(student1 == null) return new ResponseEntity<>("Invalid student", HttpStatus.NO_CONTENT);
        return new ResponseEntity<>("Student added", HttpStatus.CREATED);
    }
    //getting student details using RequestParam
//    @GetMapping("/get_student")
//    public Student getStudent(@RequestParam("an") int adminNo){
//        return mapDB.getOrDefault(adminNo, null);
//    }
    //getting student details using PathVariable
//    @GetMapping("/get_student/{an}")
//    public Student getStudent(@PathVariable("an") int adminNo){
//        return mapDB.getOrDefault(adminNo, null);
//    }
    //getting student details
    @GetMapping("/get_student/{an}")
    public ResponseEntity getStudent(@PathVariable("an") int adminNo){
        Student student = studentService.getStudent(adminNo);
        if(student == null) return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(student, HttpStatus.FOUND);
    }
    //updating student
    @PutMapping("/update_student")
    public ResponseEntity updateStudent(@RequestParam("an")int adminNo, @RequestParam("name")String name){
        Student student = studentService.updateStudent(adminNo, name);
        if(student == null) return new ResponseEntity<>("Invalid request", HttpStatus.NOT_MODIFIED);
        return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
    }
    //deleting student
    @DeleteMapping("/delete_student/{an}")
    public ResponseEntity deleteStudent(@PathVariable("an")int adminNo){
        boolean status = studentService.deleteStudent(adminNo);
        if(!status) return new ResponseEntity<>("Invalid request", HttpStatus.NOT_FOUND);
        return new ResponseEntity<>("Student deteted successfully", HttpStatus.FOUND);
    }
}
