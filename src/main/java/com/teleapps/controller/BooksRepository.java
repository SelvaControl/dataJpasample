package com.teleapps.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teleapps.model.Books;

public interface BooksRepository extends JpaRepository <Books , Integer>{

}
