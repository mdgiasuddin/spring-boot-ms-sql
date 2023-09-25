package com.example.test.springmssql.repository;

import com.example.test.springmssql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
