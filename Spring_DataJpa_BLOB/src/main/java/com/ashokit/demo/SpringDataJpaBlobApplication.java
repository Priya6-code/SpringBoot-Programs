package com.ashokit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.demo.service.UserService;

@SpringBootApplication
public class SpringDataJpaBlobApplication {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataJpaBlobApplication.class, args);
		
		UserService userservice=context.getBean(UserService.class);
		userservice.saveUser();
	}

}
