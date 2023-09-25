package com.example.test.springmssql.controller;


import com.example.test.springmssql.dto.PersonRequest;
import com.example.test.springmssql.entity.Person;
import com.example.test.springmssql.entity.Student;
import com.example.test.springmssql.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping("/orphan/test/{id}")
    public String removeOrphan(@PathVariable Short id) {
        return personService.removeOrphan(id);
    }
}
