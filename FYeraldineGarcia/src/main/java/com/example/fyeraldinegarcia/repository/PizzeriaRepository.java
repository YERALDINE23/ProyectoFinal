package com.example.fyeraldinegarcia.repository;

import com.example.fyeraldinegarcia.model.Pizzeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer> {
}
