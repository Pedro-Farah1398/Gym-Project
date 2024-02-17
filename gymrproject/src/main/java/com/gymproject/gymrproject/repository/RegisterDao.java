package com.gymproject.gymrproject.repository;

import com.gymproject.gymrproject.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterDao extends JpaRepository<Register, Long> {
}
