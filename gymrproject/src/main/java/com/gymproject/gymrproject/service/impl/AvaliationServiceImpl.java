package com.gymproject.gymrproject.service.impl;

import com.gymproject.gymrproject.entity.Avaliation;
import com.gymproject.gymrproject.entity.Student;
import com.gymproject.gymrproject.entity.form.AvaliationForm;
import com.gymproject.gymrproject.entity.form.StudentForm;
import com.gymproject.gymrproject.exceptions.NoStudentFoundException;
import com.gymproject.gymrproject.repository.AvaliationDao;
import com.gymproject.gymrproject.repository.StudentDao;
import com.gymproject.gymrproject.service.AvaliationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliationServiceImpl implements AvaliationService {

    @Autowired
    private AvaliationDao avaliationDao;

    @Autowired
    private StudentDao studentDao;

    @Override
    public Avaliation create(AvaliationForm avaliationForm) {
        Avaliation avaliation = new Avaliation();
        avaliation.setHeight(avaliationForm.getHeight());
        avaliation.setWeight(avaliationForm.getWeight());

        Optional<Student> student = studentDao.findById(avaliationForm.getStudentId());

        if (student.isEmpty()) {
            throw new NoStudentFoundException();
        }

        student.ifPresent(avaliation::setStudent);
        return avaliationDao.save(avaliation);
    }

    @Override
    public Avaliation getById(Long id) {
        Optional<Avaliation> avaliation = avaliationDao.findById(id);
        return avaliation.orElse(null);
    }

    @Override
    public List<Avaliation> getAll() {
        return avaliationDao.findAll();
    }

    @Override
    public void update(Long id, StudentForm studentForm) {

    }

    @Override
    public void delete() {

    }
}
