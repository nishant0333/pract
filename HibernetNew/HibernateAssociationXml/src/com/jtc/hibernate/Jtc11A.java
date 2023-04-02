package com.jtc.hibernate;

import org.hibernate.*;

public class Jtc11A {

	public static void main(String[] args) {
		
		Transaction tx=null;
		try {
		
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session =sf.openSession();
			tx=session.beginTransaction();
			
			Address add=new Address(102,"42","noida","UP");
			Customer cust= new Customer(101,"Som","prakash","som@jtc","1234",add);
			
			session.save(cust);
			session.save(add);
			
			tx.commit();
			session.clear();
			System.out.println("inserted");
			
		}catch(Exception e) {
			
	    System.out.println(e);
		}
		
	}
}
