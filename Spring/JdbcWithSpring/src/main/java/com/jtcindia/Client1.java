package com.jtcindia;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client1 {
public static void main(String[] args) {
	System.out.println("main method");
	ApplicationContext ctx=new AnnotationConfigApplicationContext(CustomerConfig.class);
    CustomersDAO cdao=(CustomersDAO) ctx.getBean("customerDAOimpl");   
    System.out.println("container is ready");
    Customer c1=new Customer();
//    c1.setSid(101);
//    c1.setCname("Amresh");
//    c1.setEmail("ak@123");
//    c1.setPhone(987654);
//    c1.setCity("Noida");
//    cdao.addCustomer(c1);
//    Customer c2=new Customer(102,"nishant","n@123",123567,"delhi");
//    cdao.addCustomer(c2);
//    
//   Customer c3= new Customer(102,"shubham","n@333",777777,"manipur");
//    cdao.updateCustomer(c3);	
//    cdao.deleteCustomer(102);
//    System.out.println("check database");
//    
//    List<Customer>mylist=cdao.getAllCustomer();
//    for(Customer mylist1:mylist) {
//    System.out.println(mylist1);
//    }
    
    List<Customer>mylist2=cdao.getCustomerbycity("Noida");
    for (Customer mylist3 : mylist2) {
    	System.out.println(mylist2);
	}
    
    //mylist2.forEach(cust1 -> System.out.println(mylist2));
  }
}
