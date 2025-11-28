package in.ashokit.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.demo.binding.Book;
import in.ashokit.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	
	private BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public String upsertBook(Book book) {

	    Integer bookId = book.getBookId();
	    Book save = repository.save(book);

	    // If the original bookId was null, it was a new insert
	    if (bookId == null) {
	        return "book inserted";
	    } else {
	        return "book updated";
	    }
	}

	
	@Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

	@Override
	 public String deleteBook(Integer bookId) {
		
		repository.deleteById(bookId);
		return "Book Deleted";
		
	}
}
