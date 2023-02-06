package com.prodapt.restfulapp.service;

import java.util.List;

import com.prodapt.restfulapp.entities.Book;
import com.prodapt.restfulapp.exceptions.BookNotFoundException;

public interface BookService {
	
	public List<Book> getAllBooks() throws BookNotFoundException;
	
	public Book getBook(Integer bookId) throws BookNotFoundException;
	
	public Book addBook(Book newBook);
	
	public Book getBookByName(String bookName) throws BookNotFoundException;
	
	public List<Book> getBookByPublisher(String publisher) throws BookNotFoundException;
	
	public Book updateBook(Book book) throws BookNotFoundException;
	
	public String deleteBookById(Integer bookId) throws BookNotFoundException;
	
	public List<Book> getBookByAuthor(String author) throws BookNotFoundException;

}
