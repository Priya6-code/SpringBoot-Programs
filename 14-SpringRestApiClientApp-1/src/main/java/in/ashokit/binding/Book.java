package in.ashokit.binding;

import lombok.Data;

@Data
public class Book {

	private Integer BookId;
	private String BookName;
	private Double BookPrice;
	public Integer getBookId() {
		return BookId;
	}
	public void setBookId(Integer bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public Double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		BookPrice = bookPrice;
	}
	
	
}
