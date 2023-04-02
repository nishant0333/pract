package com.example.Demo5.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Demo5.beans.ConfigBean;
import com.example.Demo5.model.Person;
import com.example.Demo5.model.Vehicle;

public class Demo5Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigBean.class);
	Vehicle p = ctx.getBean(Vehicle.class);
		
		System.out.println(p.getName());
	}

}
