package com.example.Demo4.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Demo4.beans.ConfigBean;
import com.example.Demo4.model.Person;
import com.example.Demo4.model.Vehicle;

public class Demo4Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigBean.class);
		Person person=ctx.getBean("Ram",Person.class);
	Vehicle vehicle=ctx.getBean("Tata",Vehicle.class);
		System.out.println(person.getName());
		System.out.println(person.getVehicle());
		System.out.println(vehicle.getVname());
	}

}
