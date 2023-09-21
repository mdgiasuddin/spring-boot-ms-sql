package com.example.springmssql.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Dog extends Animal {

    private String color;

    @Override
    public String toString() {
        return "Dog={id:" + getId() + "," +
            "species:" + getSpecies() + "," +
            "color:" + color + "}";
    }
}
