package com.example.springmssql.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentResponse {
    private Integer id;
    private String name;
    private Byte rollNumber;
    private Integer fee;
    private Short universityId;
    private String universityName;
    private List<String> courses;
}
