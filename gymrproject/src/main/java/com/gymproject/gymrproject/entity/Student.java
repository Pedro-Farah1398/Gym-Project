package com.gymproject.gymrproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    private String name;

    @Column(unique = true)
    private String cpf;

    private String address;

    private LocalDate BirthDate;

    //one student can have multiple avaliation. Linked by "student"
    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private List<Avaliation> avaliations = new ArrayList<>();

}
