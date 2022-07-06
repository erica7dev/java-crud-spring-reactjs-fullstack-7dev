package com.crud.springreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.springreact.repository.EmployeeRepository;

@SpringBootApplication
public class SpringreactApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringreactApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
