package com.example.test.springmssql.entity;

import com.example.test.springmssql.enums.StudentType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "university")
@Where(clause = "active=true and deleted=false")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    @Column(columnDefinition = "varchar(50)")
    private String name;

    @Column(columnDefinition = "bit default 1")
    private Boolean active;

    @Column(columnDefinition = "bit default 0")
    private Boolean deleted;

    @Enumerated(EnumType.STRING)
    private StudentType studentType;
}
