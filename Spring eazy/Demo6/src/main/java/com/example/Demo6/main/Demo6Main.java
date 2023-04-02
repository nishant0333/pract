package com.example.Demo6.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Demo6.beans.ConfigBean;
import com.example.Demo6.model.Person;
import com.example.Demo6.model.Vehicle;

public class Demo6Main {

	public static void main(String[] args) {
ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigBean.class);
	
		
		Person p=ctx.getBean(Person.class);
		Vehicle v=ctx.getBean(Vehicle.class);
		
		System.out.println(p.getName());
		System.out.println(p.getId());
		System.out.println(p.getVehicle());
		System.out.println(v.getVname());

	}

}
