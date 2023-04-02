package com.example.Demo4.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.Demo4.model.Person;
import com.example.Demo4.model.Vehicle;

public class ConfigBean {
	@Bean("ganesh")
	public Person getPerson() {
		Person person = new Person();
		person.setName("Ganesh");
		
		return person;
	}
	@Bean("Ram")
	public Person getPerson1() {
		Person person = new Person();
		person.setName("Ram");
		
		return person;
	}

	@Bean(value = "Honda")
	
	public Vehicle getVehicle1() {
		Vehicle vehicle = new Vehicle();
		vehicle.setVname("Honda");
		return vehicle;
	}
	@Bean(value = "Hero")
	@Primary
	public Vehicle getVehicle2() {
		Vehicle vehicle = new Vehicle();
		vehicle.setVname("Hero");
		return vehicle;
	}
	@Bean(value = "Tata")
	public Vehicle getVehicle3() {
		Vehicle vehicle = new Vehicle();
		vehicle.setVname("Tata");
		return vehicle;
	}
}
