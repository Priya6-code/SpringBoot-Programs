package com.demo.book.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.book.entity.Book;
import com.demo.book.repository.BookRepository;

@Service
public  class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookrepository;
	
	public BookServiceImpl(BookRepository bookrepository) {
		this.bookrepository=bookrepository;
	}
	
	@Override
	public String addBook(Book book) {
		
		Integer bookId=book.getBookId();
		
		Book save = bookrepository.save(book);
		
	   return "book added successfully";
	}
	
	@Override
	public List<Book> getAllBooks(){
		
		return  (List<Book>) bookrepository.findAll();
		
	}
	
	@Override
	public String deleteBook(Integer bookId) {
		
		bookrepository.deleteById(bookId);
		
		return "Book deleted";
		
	}

	@Override
	public String updateBook(Book book) {
		 if (bookrepository.existsById(book.getBookId())) {
		        bookrepository.save(book);
		        return "Book updated successfully";
		    } else {
		        return "Book not found";
		    }
	}
}

