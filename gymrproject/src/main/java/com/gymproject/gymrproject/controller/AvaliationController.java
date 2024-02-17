package com.gymproject.gymrproject.controller;

import com.gymproject.gymrproject.entity.Avaliation;
import com.gymproject.gymrproject.entity.form.AvaliationForm;
import com.gymproject.gymrproject.exceptions.NoStudentFoundException;
import com.gymproject.gymrproject.service.AvaliationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliations")
public class AvaliationController {

    @Autowired
    private AvaliationService service;

    private static final Logger logger = LoggerFactory.getLogger(AvaliationController.class);

    @GetMapping("/getAll")
    public ResponseEntity<List<Avaliation>> getAll() {
        List<Avaliation> avaliations = service.getAll();
        return ResponseEntity.ok().body(avaliations);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> create(@RequestBody AvaliationForm avaliationForm) {
        try {
            Avaliation createdAvaliation =  service.create(avaliationForm);
            return ResponseEntity.ok().body(createdAvaliation);
        } catch (NoStudentFoundException e) {
            String err = "It's not possible to create avaliation because student with id: " +
                    avaliationForm.getStudentId() + "is not registered.";
            logger.error(err);
            return ResponseEntity.badRequest().body(err);
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Avaliation> getById(@PathVariable Long id) {
        Avaliation avaliation =  service.getById(id);
        return ResponseEntity.ok().body(avaliation);
    }
}
