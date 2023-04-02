package com.example9.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example9.beans.Person;
import com.example9.beans.Vehicle;
import com.example9.config.projectConfig;

public class Example9 {

	public static void main(String[] args) {
var context =new AnnotationConfigApplicationContext("projectConfig.class");
	
	Person person =context.getBean(Person.class);
	Vehicle vehicle=context.getBean(Vehicle.class);
	
	System.out.println("person name from Spring Context is :"+ person.getName());
	System.out.println("Vehicle name from spring Context is :"+vehicle.getName());
	System.out.println("Vehicle that person own is :"+person.getVehicle());
	
	
	}

}
