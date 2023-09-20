package com.example.springmssql.repository;

import com.example.springmssql.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Short> {
}
