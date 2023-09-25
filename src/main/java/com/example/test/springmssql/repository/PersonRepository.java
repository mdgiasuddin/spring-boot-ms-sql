package com.example.test.springmssql.repository;

import com.example.test.springmssql.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

//    @Query("select p from Person p where substring(concat(p.createdAt, ''), 12, 5) between :startTime and :endTime")
//    List<Person> filterByTime(String startTime, String endTime);
}
