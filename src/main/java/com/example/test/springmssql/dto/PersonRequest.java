package com.example.test.springmssql.dto;

import jakarta.validation.constraints.NotBlank;

public record PersonRequest(
    @NotBlank
    String name,
    @NotBlank
    String nationality
) {
}
