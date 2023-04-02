package com.example2.config;
import com.example2.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example2.beans.Vehicle;

@Configuration
public class projectConfig {
	
	
	@Bean
Vehicle vehicle1() {
	var veh=new Vehicle();
	veh.setName("Audi");
	return veh;	
}
	
	@Bean
	Vehicle vehicle2() {
		var veh=new Vehicle();
		veh.setName("Honda");
		return veh;
	}
	@Bean
	Vehicle vehicle3() {
		var veh=new Vehicle();
		veh.setName("Ferrari");
		return veh;
		
	}
}
