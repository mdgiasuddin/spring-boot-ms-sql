package com.example.test.springmssql.service;


import com.example.test.springmssql.dto.PersonRequest;
import com.example.test.springmssql.entity.Country;
import com.example.test.springmssql.entity.Person;
import com.example.test.springmssql.entity.Student;
import com.example.test.springmssql.repository.CountryRepository;
import com.example.test.springmssql.repository.PersonRepository;
import com.example.test.springmssql.repository.StudentRepository;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final StudentRepository studentRepository;
    private final CountryRepository countryRepository;

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

    public String removeOrphan(Short id) {
        Country country = countryRepository.findCountryById(id).orElseThrow();

        country.getPeople().removeIf(person -> person.getId() == 4);
        country.getPeople().forEach(person -> person.setName("Sajol Saha.."));

        Person person = new Person();
        person.setDob(LocalDate.now());
        person.setName("Test Name");
        person.setCountry(country);
        country.getPeople().add(person);

        countryRepository.save(country);

        return "Updated successfully!";
    }
}
