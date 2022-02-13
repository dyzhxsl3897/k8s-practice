package com.k8s.practice.backend.service2.repos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.k8s.practice.backend.service2.beans.Book;

@Repository
public class BookRepository {

	private List<Book> books;

	public BookRepository() {
		this.books = new ArrayList<>();
		this.books.add(new Book("Thinking in Java", "Bruce Eckel"));
	}

	public Book getByName(String name) {
		return this.books.stream().filter(book -> book.getName().equals(name)).findFirst().orElse(null);
	}

}
