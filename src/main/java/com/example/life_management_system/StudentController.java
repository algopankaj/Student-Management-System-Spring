package com.example.life_management_system;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController  // Here writing for api end point ...
public class StudentController {
    HashMap<Integer,Student>hashMap=new HashMap<>();

    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody @NotNull Student student){

        int key=student.getRollNo();
        hashMap.put(key,student);
    }
    @GetMapping("/getStudentInfo")
    public Student getStudent(@RequestParam("rollNo") Integer rollNo){

        Student student=hashMap.get(rollNo);
        return student;

    }
    @GetMapping("/getAge")
    public int studentNo(@RequestParam("rollNo") Integer ignoredRollNo){
        return hashMap.get(ignoredRollNo).getAge();
    }

}
