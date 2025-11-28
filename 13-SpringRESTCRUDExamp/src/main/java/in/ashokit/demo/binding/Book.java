package in.ashokit.demo.binding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="BOOK_DTLS")
public class Book {

    @Id
    @Column(name="BOOK_ID")
    private Integer bookId;

    @Column(name="BOOK_NAME")
    private String bookName;

    @Column(name="BOOK_AUTHOR")
    private String bookAuthor;

    @Column(name="BOOK_PRICE")
    private Double bookPrice;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
    
}
