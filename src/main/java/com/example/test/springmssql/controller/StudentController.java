package com.example.test.springmssql.controller;


import com.example.test.springmssql.dto.StudentRequest;
import com.example.test.springmssql.dto.StudentResponse;
import com.example.test.springmssql.dto.StudentTypeDTO;
import com.example.test.springmssql.enums.StudentType;
import com.example.test.springmssql.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public StudentRequest saveStudent(@RequestBody @Validated StudentRequest request) {
        System.out.println(request);
        return request;
    }

    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable int id) {
        return studentService.getStudentInfoById(id);
    }

    @GetMapping("/student-type/all")
    public List<StudentTypeDTO> getAllStudentType() {
        List<StudentTypeDTO> response = new ArrayList<>();
        for (StudentType studentType : StudentType.values()) {
            response.add(new StudentTypeDTO(studentType.name(), studentType.getValue()));
        }
        return response;
    }
}
