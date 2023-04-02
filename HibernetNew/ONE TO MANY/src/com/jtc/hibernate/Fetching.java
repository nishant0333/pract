package com.jtc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Fetching {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		Session s=factory.openSession();
		//Transaction tx=s.beginTransaction();
		
		
		Question q=(Question)s.get(Question.class,123);
		System.out.println(q.getQuestion());
		
		for(Answer a:q.getAnswer()) {
			System.out.println(a.getAnswer());
			
		}
		
		//tx.commit();
		factory.close();
	}
}
