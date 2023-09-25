package com.example.test.springmssql.repository;

import com.example.test.springmssql.entity.Crocodile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrocodileRepository extends JpaRepository<Crocodile, Integer> {
}
