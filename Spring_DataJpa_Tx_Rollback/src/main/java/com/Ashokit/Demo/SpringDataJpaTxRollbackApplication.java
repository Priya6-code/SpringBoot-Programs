package com.Ashokit.Demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Ashokit.Demo.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaTxRollbackApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataJpaTxRollbackApplication.class, args);
		EmployeeService service=context.getBean(EmployeeService.class);
		service.saveData();
		context.close();
		
	}

}
