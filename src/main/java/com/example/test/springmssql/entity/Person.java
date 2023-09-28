package com.example.test.springmssql.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Country country;

    @ManyToMany
    @JoinTable(
        name = "map__student__university",
        joinColumns = @JoinColumn(
            foreignKey = @ForeignKey(name = "FK__student__map__student__university")
        ),
        inverseJoinColumns = @JoinColumn(
            name = "university_id",
            foreignKey = @ForeignKey(name = "FK__university__map__student__university")
        )
    )
    private Set<University> universities;

    private LocalDate dob;
    private LocalDateTime dobTime;
    private ZonedDateTime dobZoned;
}
