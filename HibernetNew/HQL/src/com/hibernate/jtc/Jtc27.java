package com.hibernate.jtc;
import java.util.*;
public class Jtc27 {
public static void main(String[] args) {
	
	CustomerDAO cdao=DAOFactory.getCustomerDAO();
	
	Customer c1=new Customer(1,"som1","som@jtc","noida",100.0,"MASTER",12345,"Active");
	cdao.addCustomer(c1);
	Customer c2=new Customer(2, "NISHA","ida@jtc","noida",200,"VISA",12346,"Active");
	cdao.addCustomer(c2);
	Customer c3=new Customer(3, "RAHUL","RA@jtc","noida",300,"Rupey",12347,"Active");
	cdao.addCustomer(c3);
	Customer c4=new Customer(4, "RAHUL1","RA@jtc","noida",300,"Rupey",12347,"Active");
	cdao.addCustomer(c4);
	
	
	
	System.out.println("All Customers");
	List <Customer>list=cdao.getAllCustomers();
	System.out.println("test");
	for(Customer c:list) {
		System.out.println(c);
	}
	System.out.println("Customer By City");
	list=cdao.getCustomersByCity("noida");
	for (Customer c: list) {
		System.out.println(c);
		
}
	System.out.println("Get Customer by city 0 3");
	 list=cdao.getCustomersByCity("noida",0,3);
	for (Customer c:list) {
		System.out.println(c);
	}
	System.out.println("Get Customer by cardtype");
	list=cdao.getCustomersByCardType("MASTER");
	for(Customer c:list) {
		System.out.println(c);
	}
	System.out.println("Get Customer by bal");
	list=cdao.getCustomersByBal(15200.0);
	for (Customer c: list) {
		System.out.println(c);
	}
	
	System.out.println("Get Customer by bal 0 1");
	list=cdao.getCustomersByBal(15200.0,0,1);
	for (Customer c: list) {
		System.out.println(c);
	}
	System.out.println("Get Customer by status");
	list=cdao.getCustomersByStatus("Active");
	for (Customer c: list) {
		System.out.println(c);
	}
	System.out.println("Get Customer by status 0 3");
	list=cdao.getCustomersByStatus("Active",0,3);
	for (Customer c: list) {
		System.out.println(c);
	}
	System.out.println("Get customer by name");
	list=cdao.getCustomersByName("som1");
	for (Customer c: list) {
		System.out.println(c);
		
	}
	System.out.println("Get Customer by CardType");
//	list=cdao.getCustomers("noida","VISA");
//	for(Customer c:list) {
//		System.out.println(c);
	//}
	System.out.println("Get Customer by CardType status");
	list=cdao.getCustomers("noida","VISA","Active");
	for (Customer c: list) {
		System.out.println(c);
	}
	System.out.println("Get Customer by email");
	Customer c=(Customer)cdao.getCustomerByEmail("som@jtc.org");
	System.out.println(c);
	System.out.println("Get All Customer By CCNO");
	c=cdao.getCustomerByCardNo(12345);
	System.out.println(c);
}	
}
