package com.jlcindia.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyClient {
	public static void main(String[] args){
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JLCAppConfig.class);
	CustomerDAO custDAO =(CustomerDAO) ctx.getBean("custDAO"); 
	Customer cust = new Customer(101,"hai","hello@jlc",12345,"Delhi");  
	custDAO.addCustomer(cust);  
	List<Customer> mylist1 = custDAO.getAllCustomers();  
	mylist1.forEach(mycust -> 
	System.out.println(mycust));  
	System.out.println("-----------");  
	List<Customer> mylist2 = custDAO.getCustomersByCity("Blore");  
	mylist2.forEach(mycust -> 
	System.out.println(mycust));  
	System.out.println("Done!!!");  


}}