package com.example.Demo8.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.Demo8.Service.VehicleServices;

@Component("vehicleBean")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Vehicle {
	private String name = "Honda";
	
	private final  VehicleServices services;

	
	@Autowired
	public Vehicle(VehicleServices services) {
		super();
		this.services = services;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VehicleServices getServices() {
		return services;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", services=" + services + "]";
	}

	

}
