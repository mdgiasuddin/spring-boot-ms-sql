package com.example.springmssql.repository;

import com.example.springmssql.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

//    @Query("select p from Person p where substring(concat(p.createdAt, ''), 12, 5) between :startTime and :endTime")
//    List<Person> filterByTime(String startTime, String endTime);
}
