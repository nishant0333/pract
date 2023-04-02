package com.example8.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ecample8 {

	public static void main(String[] args) {
		 var context = new ClassPathXmlApplicationContext("beans.xml");
	        Vehicle vehicle = context.getBean(Vehicle.class);
	        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());


	}

}
