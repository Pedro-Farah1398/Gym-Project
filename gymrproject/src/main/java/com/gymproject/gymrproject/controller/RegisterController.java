package com.gymproject.gymrproject.controller;

import com.gymproject.gymrproject.entity.Register;
import com.gymproject.gymrproject.entity.Student;
import com.gymproject.gymrproject.entity.form.RegisterForm;
import com.gymproject.gymrproject.entity.form.StudentForm;
import com.gymproject.gymrproject.service.RegisterService;
import com.gymproject.gymrproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService service;

    @GetMapping("/getAll")
    public ResponseEntity<List<Register>> getAll(){
        List<Register> registers = service.getAll();
        return ResponseEntity.ok().body(registers);
    }

    @GetMapping("/create")
    public ResponseEntity<Register> create(@RequestBody RegisterForm registerForm){
        Register createdRegister = service.create(registerForm);
        return ResponseEntity.ok().body(createdRegister);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Register> getById(@PathVariable Long id) {
        Register register =  service.getById(id);
        return ResponseEntity.ok().body(register);
    }
}
