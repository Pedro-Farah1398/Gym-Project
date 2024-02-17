package com.gymproject.gymrproject.repository;

import com.gymproject.gymrproject.entity.Avaliation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvaliationDao extends JpaRepository<Avaliation, Long>
{
    public List<Avaliation> findByStudentId(Long id);
}
