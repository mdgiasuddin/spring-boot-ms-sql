package com.example.springmssql.controller;


import com.example.springmssql.dto.PersonRequest;
import com.example.springmssql.entity.Person;
import com.example.springmssql.entity.Student;
import com.example.springmssql.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/people")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public String savePerson(@RequestBody @Validated PersonRequest request) {
        return personService.savePerson(request);
    }

    @GetMapping
    public List<Person> getAllPerson() {

        return personService.getAllPerson();
    }

    @GetMapping("/student")
    public List<Student> getAllStudent() {
        return personService.getAllStudent();
    }
}
