package com.gymproject.gymrproject.controller;

import com.gymproject.gymrproject.entity.Avaliation;
import com.gymproject.gymrproject.entity.Student;
import com.gymproject.gymrproject.entity.form.StudentForm;
import com.gymproject.gymrproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAll(){
        List<Student> students = service.getAll();
        return ResponseEntity.ok().body(students);
    }

    @GetMapping("/create")
    public ResponseEntity<Student> create(@RequestBody StudentForm studentForm){
        Student createdStudent = service.create(studentForm);
        return ResponseEntity.ok().body(createdStudent);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getById(@PathVariable Long id) {
        Student student =  service.getById(id);
        return ResponseEntity.ok().body(student);
    }
}
