package com.example.springmssql.controller;


import com.example.springmssql.dto.StudentRequest;
import com.example.springmssql.dto.StudentResponse;
import com.example.springmssql.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
