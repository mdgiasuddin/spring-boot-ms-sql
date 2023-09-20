package com.example.springmssql.repository;

import com.example.springmssql.entity.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @EntityGraph(attributePaths = {"university", "studentCourseMappings.course"})
    Optional<Student> findStudentById(Integer id);
}
