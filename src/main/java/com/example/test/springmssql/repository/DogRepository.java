package com.example.test.springmssql.repository;

import com.example.test.springmssql.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Integer> {
}
