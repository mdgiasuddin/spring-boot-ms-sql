package com.example.test.springmssql.dto;

import com.example.test.springmssql.enums.StudentType;

public record UniversityDTO(
    Short id,
    String name,
    Boolean active,
    Boolean deleted,
    String test,
    StudentType studentType
) {
}
