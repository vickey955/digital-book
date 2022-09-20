package com.digitalbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbook.beans.Book;
import com.digitalbook.beans.Responce;
import com.digitalbook.entities.BookEntity;
import com.digitalbook.service.BookService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping(value = "/savebook")
	public Responce saveBookDetails(@RequestBody Book book) {
		bookService.saveBookDetails(book);
		Responce responce = new Responce();
		responce.setStatus(200);
		responce.setMessage("Success");
		return responce;
	}

	@GetMapping("/fetchbooks")
	public Responce fetchBookDetails() {
		List<BookEntity> list = bookService.getAllUsers();
		Responce responce = new Responce();
		responce.setStatus(200);
		responce.setMessage("Success");
		responce.setData(list);
		return responce;

	}

}
