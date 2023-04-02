package com.example9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example9.beans.Person;
import com.example9.beans.Vehicle;

@Configuration
public class projectConfig {
	@Bean
	public Vehicle vehicle() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Tayota");
		return vehicle;
	}
	 @Bean
	    public Person person() {
	        Person person = new Person();
	        person.setName("Lucy");
	        person.setVehicle(vehicle());
	        return person;
	    }
}
