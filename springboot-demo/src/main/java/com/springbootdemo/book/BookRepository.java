package com.springbootdemo.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface BookRepository extends JpaRepository<Book, Long> {
	
}
