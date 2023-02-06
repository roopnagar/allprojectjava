package com.prodapt.restfulapp.repositries;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.restfulapp.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
		Book findByBookName(String bookName);
		List<Book> findByAuthor(String author);
		List<Book> findByPublisher(String publisher); 
}
