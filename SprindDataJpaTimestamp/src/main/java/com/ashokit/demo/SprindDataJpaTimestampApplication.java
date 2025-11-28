package com.ashokit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.demo.Entity.Product;
import com.ashokit.demo.repository.ProductRepository;

@SpringBootApplication
public class SprindDataJpaTimestampApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SprindDataJpaTimestampApplication.class, args);
		
		ProductRepository repository= context.getBean(ProductRepository.class);
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		
		p1.setPname("Keyboard");
		p1.setPrice(4000.00);	
		
		p2.setPname("Mouse");
		p2.setPrice(5000.00);
		repository.save(p1);
		
		p3.setPname("Laptop");
		p3.setPrice(60000.0);
		repository.save(p3);
	}

}
