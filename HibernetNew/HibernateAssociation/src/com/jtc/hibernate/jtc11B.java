package com.jtc.hibernate;
import org.hibernate.*;
public class jtc11B {
public static void main(String[] arg) {
Transaction tx=null;
try {
	
 SessionFactory sf=HibernateUtil.getSessionFactory();
 Session session = sf.openSession();
 tx=session.beginTransaction();
 
 Customer cust=(Customer)session.load(Customer.class,101);
 System.out.println(cust.getCid()+"\t"+cust.getFirstName()+"\t"+cust.getLastName()+"\t"+cust.getEmail()+"\t"+cust.getPhone());

 Address add=cust.getAddress();
 System.out.println(add.getAid()+"\t"+add.getCity()+"\t"+add.getStreet()+"\t"+add.getState());
 
tx.commit();
session.close();
System.out.println("record inserted");	
}catch(Exception e) {
	e.printStackTrace();
}
}
}
