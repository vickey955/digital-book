package com.digitalbook.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbook.beans.Book;
import com.digitalbook.entities.BookEntity;
import com.digitalbook.repositery.BookRepositery;


@Service
public class BookService {

	@Autowired
	private BookRepositery bookRepositery;

	@Transactional
	public void saveBookDetails(Book book) {
		BookEntity bookentity = new BookEntity();
		BeanUtils.copyProperties(book, bookentity);
		bookRepositery.save(bookentity);
		System.out.println(bookentity);
	}

	@Transactional
	public List<BookEntity> getAllUsers() {
		return (List<BookEntity>) bookRepositery.findAll();
	}

}
