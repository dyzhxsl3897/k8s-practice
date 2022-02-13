package com.k8s.practice.backend.service2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.k8s.practice.backend.service2.beans.Book;
import com.k8s.practice.backend.service2.services.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/getbyname")
	public Book getByName(@RequestParam(value = "name") String name) {
		return bookService.getByName(name);
	}

}
