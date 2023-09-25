package com.example.test.springmssql.dto;

import com.example.test.springmssql.enums.StudentType;

public record StudentRequest(
    String name,
    Short universityId,
    StudentType studentType
) {
}
