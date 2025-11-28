package in.ashokit.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import in.ashokit.binding.Book;

@Service
public class BookClient {

	public void invokeBookTicket() {
	String apiurl="http://localhost:8080/book";
	
	Book book=new Book();
	book.setBookId(101);
	book.setBookName("Java");
	book.setBookPrice(450.0);
	
	RestTemplate rt=new RestTemplate();
	ResponseEntity<String> pfe=rt.postForEntity(apiurl,book,String.class);
    System.out.println(pfe.getBody());
	
}
}

