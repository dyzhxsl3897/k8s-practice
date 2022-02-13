package com.k8s.practice.backend.service2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k8s.practice.backend.service2.beans.Book;
import com.k8s.practice.backend.service2.repos.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book getByName(String name) {
		return bookRepository.getByName(name);
	}

}
