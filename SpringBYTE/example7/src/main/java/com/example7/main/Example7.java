package com.example7.main;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example7.beans.vehicle;
import com.example7.config.projectConfig;

public class Example7 {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(projectConfig.class);
		vehicle volkswagen = new vehicle();
		volkswagen.setName("Volkswagen");
		Supplier<vehicle> volkswaSupplier = () -> volkswagen;

		Supplier<vehicle> audiSupplier = () -> {
			vehicle audi = new vehicle();
			audi.setName("Audi");
			return audi;
		};

		Random random = new Random();

		int randomNumber = random.nextInt(10);
		System.out.println("randomNumber = " + randomNumber);

		if ((randomNumber % 2) == 0) {

			context.registerBean("volkswagen", vehicle.class, volkswaSupplier);
		} else {
			context.registerBean("audi", vehicle.class, audiSupplier);
		}

		vehicle volksVehicle = null;
		vehicle audiVehicle = null;

		try {
			volksVehicle = context.getBean("volkswagen", vehicle.class);
		} catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
			System.out.println("Error while creating Volkswagen vehicle");
		}
		try {
			audiVehicle = context.getBean("audi", vehicle.class);

		} catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
			System.out.println("Error while creating Audi vehicle");
		}
		if (null != volksVehicle) {
			System.out.println("Programming Vehicle name from Spring Context is: " + volksVehicle.getName());
		} else {
			System.out.println("Programming Vehicle name from Context is: " + audiVehicle.getName());
		}
	}

}
