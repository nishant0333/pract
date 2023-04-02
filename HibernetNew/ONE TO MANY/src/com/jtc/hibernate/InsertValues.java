package com.jtc.hibernate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class InsertValues {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	//inserting Question value
	//Question q1=new Question();
	//q1.setQuestionId(1212);
	//q1.setQuestion("what is java?");
	
	//inserting Answer value
	//Answer a1=new Answer();
	//a1.setAnswerId(343);
	//a1.setAnswer("java is programing language.");
	//a1.setQuestion(q1);
	//q1.setAnswer(a1);
	
	//inserting Question value
		Question q2=new Question();
		q2.setQuestionId(123);
		q2.setQuestion("what is your name?");
		
		//inserting Answer value
		Answer a2=new Answer();
		a2.setAnswerId(345);
		a2.setAnswer("My name is Nishant");
		a2.setQuestion(q2);
		
		
		//inserting Answer value
				Answer a3=new Answer();
				a3.setAnswerId(346);
				a3.setAnswer("My name is Ram");
				a3.setQuestion(q2);
				
				
				//inserting Answer value
				Answer a4=new Answer();
				a4.setAnswerId(347);
				a4.setAnswer("My name is Mohan");
				a4.setQuestion(q2);
				
				//creating list to store multiple answer
				List<Answer> list=new ArrayList<Answer>();
				list.add(a2);
				list.add(a3);
				list.add(a4);
				q2.setAnswer(list);
		
	//Session
	Session s=factory.openSession();
	Transaction tx=s.beginTransaction();
	//save
	s.save(q2);
	s.save(a2);
	s.save(a3);
	s.save(a4);
	//s.save(q1);
	//s.save(a1);
	//s.save(q2);
	//s.save(a2);

	
		
	
	tx.commit();
	factory.close();
}}

