package com.hellokoding.restfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.restfulapi.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer>{
}
