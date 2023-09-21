package com.example.springmssql.repository;

import com.example.springmssql.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Integer> {
}
