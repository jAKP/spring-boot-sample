package com.hellokoding.restfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.restfulapi.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
}
