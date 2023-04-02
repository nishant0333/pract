package com.jtcindia.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootApplication implements CommandLineRunner{
@Autowired
CustomerDAO custDAO;
@Override
public void run(String...args) throws Exception{
	Customer cust=new Customer(108, "hai", "hai@jtc",12345 ,"noida");
	custDAO.addCustomer(cust);

	
	List<Customer> mylist1=custDAO.getAllCustomers();
	mylist1.forEach(mycust->System.out.println(mycust));
	System.out.println("---------");
	
	List<Customer> mylist2=custDAO.getCustomersByCity("Delhi");
	mylist2.forEach(mycust->System.out.println(mycust));
	System.out.println("Done!!!");
	
	/*
	 * List<Customer> mylist3=custDAO.getCustomersByEmail("Ballia");
	 * mylist3.forEach(mycust->System.out.println(mycust));
	 * System.out.println("EmailDone!!!");
	 */
}


	
	public static void main(String[] args) {
		SpringApplication.run(MyBootApplication.class, args);
	
}
}
