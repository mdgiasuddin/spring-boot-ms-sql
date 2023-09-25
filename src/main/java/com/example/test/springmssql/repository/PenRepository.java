package com.example.test.springmssql.repository;

import com.example.test.springmssql.entity.Pen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PenRepository extends JpaRepository<Pen, Integer> {
}
