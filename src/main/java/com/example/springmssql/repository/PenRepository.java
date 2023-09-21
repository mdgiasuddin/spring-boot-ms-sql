package com.example.springmssql.repository;

import com.example.springmssql.entity.Pen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PenRepository extends JpaRepository<Pen, Integer> {
}
