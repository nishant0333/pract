package com.example.Demo8.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Demo8.Service.VehicleServices;
import com.example.Demo8.config.BeanConfig;

public class Demo8Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
		VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
		System.out.println("Hashcode of the object vehicleServices1 : " + vehicleServices1.hashCode());
		System.out.println("Hashcode of the object vehicleServices2 : " + vehicleServices2.hashCode());
		if (vehicleServices1 == vehicleServices2) {
			System.out.println("VehicleServices bean is a singleton scoped bean");
		}
		
		System.out.println(vehicleServices1.getSpeaker());
		System.out.println(vehicleServices1.getTyres());
	}

}
