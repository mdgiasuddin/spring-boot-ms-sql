package com.example.springmssql.repository;

import com.example.springmssql.entity.Crocodile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrocodileRepository extends JpaRepository<Crocodile, Integer> {
}
