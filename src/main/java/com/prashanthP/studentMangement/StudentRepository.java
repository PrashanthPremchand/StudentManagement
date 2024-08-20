package com.prashanthP.studentMangement;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {
    Map<Integer, Student> mapDB = new HashMap<>();
    //adding student
    public Student addStudent(Student student){
        if(student != null){
            mapDB.put(student.getAdminNo(), student);
        }
        return student;
    }
    //getting student
    public Student getStudent(int adminNo){
        return mapDB.getOrDefault(adminNo, null);
    }
    //updating student
    public Student updateStudent(int adminNo, String name){
        if(!mapDB.containsKey(adminNo)) return null;
        mapDB.get(adminNo).setName(name);
        return mapDB.get(adminNo);
    }
    //deleting student
    public boolean deleteStudent(int adminNo){
        if(!mapDB.containsKey(adminNo)) return false;
        mapDB.remove(adminNo);
        return true;
    }
}
