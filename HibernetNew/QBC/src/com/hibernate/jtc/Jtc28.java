package com.hibernate.jtc;
import java.util.*;
public class Jtc28{
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
	
	
	  System.out.println("get customer by email");
      List<Customer> c5=(List<Customer>)cdao.getCustomerByEmail("som@jtc");
      System.out.println(c5);
      
//      System.out.println("get all customers by ccno");
//      c5=(List<Customer>)cdao.getCustomerCardNo(12345);
//      System.out.println(c5);
}
}
