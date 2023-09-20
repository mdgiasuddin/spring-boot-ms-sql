package com.example.springmssql.service;

import com.example.springmssql.dto.StudentResponse;
import com.example.springmssql.entity.Student;
import com.example.springmssql.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

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
}
