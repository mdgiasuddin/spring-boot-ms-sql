package com.example.test.springmssql.entity;


import com.example.test.springmssql.enums.StudentCourseMapping;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(100)")
    private String name;

    @Column(columnDefinition = "tinyint")
    private Byte rollNumber;

    @Column(columnDefinition = "tinyint")
    private Integer fee;

    @ManyToOne(fetch = FetchType.LAZY)
    private University university;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private Set<StudentCourseMapping> studentCourseMappings;
}
