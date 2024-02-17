package com.gymproject.gymrproject.service.impl;

import com.gymproject.gymrproject.entity.Student;
import com.gymproject.gymrproject.entity.form.StudentForm;
import com.gymproject.gymrproject.repository.StudentDao;
import com.gymproject.gymrproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDao studentDao;

    @Override
    public Student create(StudentForm studentForm) {
        Student student = new Student();
        student.setName(studentForm.getName());
        student.setCpf(studentForm.getCpf());
        student.setAddress(studentForm.getAddress());
        student.setBirthDate(studentForm.getBirthDate());

        return studentDao.save(student);
    }

    @Override
    public Student getById(Long id) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return studentDao.findAll();
    }

    @Override
    public void update(Long id, StudentForm studentForm) {

    }

    @Override
    public void delete() {

    }
}
