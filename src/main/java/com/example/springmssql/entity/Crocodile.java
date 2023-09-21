package com.example.springmssql.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Crocodile extends Animal{

    private String description;
}
