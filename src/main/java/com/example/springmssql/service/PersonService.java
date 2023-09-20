package com.example.springmssql.service;


import com.example.springmssql.dto.PersonRequest;
import com.example.springmssql.entity.Person;
import com.example.springmssql.entity.Student;
import com.example.springmssql.repository.PersonRepository;
import com.example.springmssql.repository.StudentRepository;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final StudentRepository studentRepository;

    public String savePerson(PersonRequest request) {
        Person person = new Person();
        person.setName(request.name());

        personRepository.save(person);
        return "Person saved successfully!";
    }

    public List<Person> getAllPerson() {

        return personRepository.findAll();
//        int startHour = 4;
//        int startMinute = 50;
//        boolean isStartAM = true;
//
//        int endHour = 8;
//        int endMinute = 7;
//        boolean isEndAM = false;
//
//        return filterPerson(startHour, startMinute, isStartAM, endHour, endMinute, isEndAM);
    }

    List<Person> filterPerson(
        int startHour, int startMinute, boolean isStartAM,
        int endHour, int endMinute, boolean isEndAM
    ) {
        String startTime = String.format(
            "%02d:%02d",
            (isStartAM ? startHour : 12 + startHour),
            startMinute
        );

        String endTime = String.format(
            "%02d:%02d",
            (isEndAM ? endHour : 12 + endHour),
            endMinute
        );

        return new ArrayList<>();

//        return personRepository.filterByTime(startTime, endTime);
    }

    @PreDestroy
    public void stop() {
        System.out.println("Stop person service");
    }

    public List<Student> getAllStudent() {
        return new ArrayList<>();
    }
}
