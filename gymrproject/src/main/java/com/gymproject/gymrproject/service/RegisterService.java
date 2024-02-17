package com.gymproject.gymrproject.service;

import com.gymproject.gymrproject.entity.Register;
import com.gymproject.gymrproject.entity.form.RegisterForm;

import java.util.List;

public interface RegisterService {

    Register create(RegisterForm registerForm);

    Register getById(Long id);

    List<Register> getAll();

    void delete();
}
