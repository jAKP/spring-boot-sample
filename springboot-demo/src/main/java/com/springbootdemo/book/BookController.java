package com.springbootdemo.book;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	private BookRepository repository;

	public BookController(BookRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/books")
	public Collection<Book> getBooks() {
		return repository.findAll();
	}

	@GetMapping("/good-books")
	public Collection<Book> goodBeers() {
		return repository.findAll().stream().filter(this::isGood).collect(Collectors.toList());
	}

	private boolean isGood(Book book) {
		return !book.getName().equals("Book-2") && !book.getName().equals("Book-3");
	}
}
