package com.example.test.springmssql.service;

import com.example.test.springmssql.dto.StudentResponse;
import com.example.test.springmssql.dto.UniversityDTO;
import com.example.test.springmssql.entity.Student;
import com.example.test.springmssql.entity.University;
import com.example.test.springmssql.enums.StudentType;
import com.example.test.springmssql.mapper.UniversityMapper;
import com.example.test.springmssql.repository.BookRepository;
import com.example.test.springmssql.repository.CrocodileRepository;
import com.example.test.springmssql.repository.DogRepository;
import com.example.test.springmssql.repository.PenRepository;
import com.example.test.springmssql.repository.StudentRepository;
import com.example.test.springmssql.repository.UniversityRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final UniversityRepository universityRepository;
    private final BookRepository bookRepository;
    private final PenRepository penRepository;
    private final DogRepository dogRepository;
    private final CrocodileRepository crocodileRepository;
    private final UniversityMapper universityMapper;

    public StudentResponse getStudentInfoById(int id) {
        Student student = studentRepository.findStudentById(id)
            .orElseThrow(() -> new RuntimeException("No student found.."));

        return new StudentResponse(
            student.getId(),
            student.getName(),
            student.getRollNumber(),
            student.getFee(),
            student.getUniversity().getId(),
            student.getUniversity().getName(),
            student.getStudentCourseMappings()
                .stream()
                .map(mapping -> mapping.getCourse().getName())
                .toList()
        );
    }

    @PostConstruct
    public void saveBook() {
        /*Book book = new Book();
        book.setName("Book - 1");
        book.setPrice(100D);

        bookRepository.save(book);

        Pen pen = new Pen();
        pen.setName("Favourite Pen");
        pen.setColor("RED");
        penRepository.save(pen);

        List<Pen> pens = penRepository.findAll();
        System.out.println("Pen: " + pens);*/

        /*Dog dog = new Dog();
        dog.setSpecies("Mamalia");
        dog.setColor("BLACK");
        dogRepository.save(dog);

        Crocodile crocodile = new Crocodile();
        crocodile.setSpecies("Reptilia");
        crocodile.setDescription("Marine water crocodile");
        crocodileRepository.save(crocodile);

        List<Dog> dogs = dogRepository.findAll();
        System.out.println("Dogs: " + dogs);*/

//        List<University> universities = universityRepository.findAll();
//        System.out.println("University: " + universities);

        Short id = 1;
        University university = universityMapper.createUniversityFromDTO(new UniversityDTO(id, "CUET-123", true, false, "Test", StudentType.REGULAR));
        System.out.println(university);
    }
}
