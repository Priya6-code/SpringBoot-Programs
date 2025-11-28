package com.demo.book.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.book.entity.Book;
import com.demo.book.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookservice;
	
	@PostMapping("/book")
	public  ResponseEntity<String> upsertBook(@RequestBody Book book){
		
		String msg = bookservice.addBook(book);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/books")
	public ResponseEntity<Iterable<Book>> getAllBooks(){
		
		Iterable<Book> msg1=bookservice.getAllBooks();
		return new ResponseEntity<>(msg1,HttpStatus.OK);
		
	}
	
	@PutMapping("/updatebook")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		
		   String msg2 = bookservice.updateBook(book);
		return new ResponseEntity<>(msg2,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deletebook/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookId){
		
		 String msg3 = bookservice.deleteBook(bookId);
			return new ResponseEntity<>(msg3,HttpStatus.OK);
	}
	
}
