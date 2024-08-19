package com.prashanthP.studentMangement;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {
    Map<Integer, Student> mapDB = new HashMap<>();
    //adding student
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        if(student == null) return "Invalid entry";
        int adminNo = student.getAdminNo();
        mapDB.put(adminNo, student);
        return "Student added successfully";
    }
    //getting student details using RequestParam
//    @GetMapping("/get_student")
//    public Student getStudent(@RequestParam("an") int adminNo){
//        return mapDB.getOrDefault(adminNo, null);
//    }
    //getting student details using PathVariable
    @GetMapping("/get_student/{an}")
    public Student getStudent(@PathVariable("an") int adminNo){
        return mapDB.getOrDefault(adminNo, null);
    }
}
