package com.example.Demo8.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.BeanDefinition;
@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Person {
	private String name = "Lucy";
	private final Vehicle vehicle;
	
	@Autowired
	public Person(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", vehicle=" + vehicle + "]";
	}
	
	
}
