package com.jtc.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {
	@Autowired
	CustomerDAO cdao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		
		
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("''''''''''''''testing Boot in run'''''''''''''");
		Customer cust=new Customer(103,"ram","nishant@jtc",123456,"Delhi");
		cdao.addCustomer(cust);
		
	}
	

}

