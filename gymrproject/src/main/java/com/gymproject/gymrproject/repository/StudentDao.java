package com.gymproject.gymrproject.repository;

import com.gymproject.gymrproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends JpaRepository<Student, Long>
{
    public List<Student> findByBirthDate();
}
