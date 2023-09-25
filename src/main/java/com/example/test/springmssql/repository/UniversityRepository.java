package com.example.test.springmssql.repository;

import com.example.test.springmssql.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Short> {
}
