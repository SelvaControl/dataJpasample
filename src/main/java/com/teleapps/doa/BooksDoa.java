package com.teleapps.doa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teleapps.controller.BooksRepository;
import com.teleapps.model.Books;


@Repository
public class BooksDoa {
	
	@Autowired
	BooksRepository booksrepository;
	
	public String saveBooks(Books book) {
		Books afterSaveResult = booksrepository.save(book);
		System.out.println("afterSaveResult"+afterSaveResult);
		return null;
		
	}

}
