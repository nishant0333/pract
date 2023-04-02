package com.example13.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example13.beans.Person;
import com.example13.beans.Vehicle;
import com.example13.config.projectConfig;

public class Example13 {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(projectConfig.class);
		String[] persons=ctx.getBeanNamesForType(Person.class);
		Person person=ctx.getBean(Person.class);
		String[] vehicle1=ctx.getBeanNamesForType(Vehicle.class);
		//Vehicle vehicle=ctx.getBean(Vehicle.class);
		//vehicle.getVehicleService().playMusic();
		//vehicle.getVehicleService().moveVehicle();
		person.getVehicle().getVehicleService().playMusic();
		person.getVehicle().getVehicleService().moveVehicle();
		
	}
}
