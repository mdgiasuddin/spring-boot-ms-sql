package com.example.springmssql.service;


import com.example.springmssql.dto.PersonRequest;
import com.example.springmssql.entity.Person;
import com.example.springmssql.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    public String savePerson(PersonRequest request) {
        Person person = new Person();
        person.setName(request.name());
        person.setNationality(request.nationality());

        personRepository.save(person);
        return "Person saved successfully!";
    }

    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
