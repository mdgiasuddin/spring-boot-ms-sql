package com.example.test.springmssql.enums;

public enum StudentType {
    REGULAR("Regular"), IRREGULAR("Irregular");

    private final String value;

    StudentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
