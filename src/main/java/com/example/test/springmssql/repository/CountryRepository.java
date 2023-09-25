package com.example.test.springmssql.repository;

import com.example.test.springmssql.entity.Country;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Short> {

    @EntityGraph(attributePaths = "people")
    Optional<Country> findCountryById(Short id);
}
