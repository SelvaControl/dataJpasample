package com.teleapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teleapps.doa.BooksDoa;
import com.teleapps.model.Books;

@RestController
@RequestMapping("/api")
public class BooksController {
	@Autowired
	BooksDoa booksDoa;
	
	@PostMapping("/savingbook")
	public String saveBooks(@RequestBody Books books) {
		String values = booksDoa.saveBooks(books);
		return "values "+ values;
	}

}
