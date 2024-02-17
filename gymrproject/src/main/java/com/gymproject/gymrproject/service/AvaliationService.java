package com.gymproject.gymrproject.service;

import com.gymproject.gymrproject.entity.Avaliation;
import com.gymproject.gymrproject.entity.form.AvaliationForm;
import com.gymproject.gymrproject.entity.form.StudentForm;

import java.util.List;


public interface AvaliationService {

    Avaliation create(AvaliationForm avaliationForm);

    Avaliation getById(Long id);

    List<Avaliation> getAll();

    void update(Long id, StudentForm studentForm);

    void delete();
}
