package com.gymproject.gymrproject.service;

import com.gymproject.gymrproject.entity.Student;
import com.gymproject.gymrproject.entity.form.StudentForm;

import java.util.List;

public interface StudentService {
    Student create(StudentForm studentForm);

    Student getById(Long id);

    List<Student> getAll();

    void update (Long id, StudentForm studentForm);

    void delete();
}
