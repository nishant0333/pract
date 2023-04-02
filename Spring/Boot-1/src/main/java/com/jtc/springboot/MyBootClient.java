package com.jtc.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootClient implements CommandLineRunner {

	@Autowired
	CustomerDAO cdao;

	public static void main(String[] args) {
		SpringApplication.run(MyBootClient.class, args);

	}

	public void run(String... args) {
		System.out.println("Testing Boot....");
		Customer cust = new Customer(107, "ashi", "som@Jtc", 1233, "noida");
		cdao.addCustomer(cust);

	}
}
