package com.springBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Client1 implements CommandLineRunner {
	@Autowired
	CustomerDAO cdao;
	
	
	public static void main(String... args) {
		SpringApplication.run(Client1.class, args);
		
	}
	
	
	public void run(String... args) throws Exception {
		System.out.println("''''''''''''''testing Boot in run'''''''''''''");
		Customer cust=new Customer(101,"nishant","nishant@jtc",123456,"Delhi");
		cdao.addCustomer(cust);
		
		List<Customer> mylist=cdao.getAllCustomers();
		for (Customer customer1 : mylist) {
			System.out.println(customer1);
			
			List<Customer> mylist1=cdao.getCustomersByCity("Delhi");
			for(Customer customer2 : mylist1) {
				System.out.println("customer2");
				
			}
		}}}
		
		
	


