package com.example.bookservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookservice.model.Book;
import com.example.bookservice.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> findAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	@Override
	public Book findBook(Long id) {
		return bookRepository.findById(id).get();
	}
	
	
}
