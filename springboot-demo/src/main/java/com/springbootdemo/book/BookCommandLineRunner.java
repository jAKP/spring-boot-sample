package com.springbootdemo.book;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class BookCommandLineRunner implements CommandLineRunner {

	private final BookRepository repository;

	public BookCommandLineRunner(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {

		Stream.of("Book-1", "Book-2", "Book-3", "Book-4", "Book-5", "Book-6", "Book-7")
				.forEach(name -> repository.save(new Book(name)));

		repository.findAll().forEach(System.out::println);
	}
}
