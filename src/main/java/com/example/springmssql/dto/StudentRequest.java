package com.example.springmssql.dto;

import com.example.springmssql.enums.StudentType;

public record StudentRequest(
    String name,
    Short universityId,
    StudentType studentType
) {
}
