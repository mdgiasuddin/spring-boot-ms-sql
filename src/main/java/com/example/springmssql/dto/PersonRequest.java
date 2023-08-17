package com.example.springmssql.dto;

import jakarta.validation.constraints.NotBlank;

public record PersonRequest(
    @NotBlank
    String name,
    @NotBlank
    String nationality
) {
}
