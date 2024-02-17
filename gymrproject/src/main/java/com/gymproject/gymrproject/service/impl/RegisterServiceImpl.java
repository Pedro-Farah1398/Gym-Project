package com.gymproject.gymrproject.service.impl;

import com.gymproject.gymrproject.entity.Avaliation;
import com.gymproject.gymrproject.entity.Register;
import com.gymproject.gymrproject.entity.Student;
import com.gymproject.gymrproject.entity.form.RegisterForm;
import com.gymproject.gymrproject.exceptions.NoStudentFoundException;
import com.gymproject.gymrproject.repository.RegisterDao;
import com.gymproject.gymrproject.repository.StudentDao;
import com.gymproject.gymrproject.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    RegisterDao registerDao;

    @Autowired
    StudentDao studentDao;

    @Override
    public Register create(RegisterForm registerForm) {
        Register register = new Register();
        register.setRegisterDate(register.getRegisterDate());

        Optional<Student> student = studentDao.findById(registerForm.getStudentId());

        if (student.isEmpty()) {
            throw new NoStudentFoundException();
        }

        student.ifPresent(register::setStudent);
        return registerDao.save(register);
    }

    @Override
    public Register getById(Long id) {
        Optional<Register> register = registerDao.findById(id);
        return register.orElse(null);
    }

    @Override
    public List<Register> getAll() {
        return registerDao.findAll();
    }

    @Override
    public void delete() {

    }
}
