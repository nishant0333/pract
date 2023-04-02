package com.example2.main;
import com.example2.beans.Vehicle;
import com.example2.config.projectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example2.beans.Vehicle;

public class example2 {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(projectConfig.class);
		var veh=context.getBean("vehicle1",Vehicle.class);
		
		
		System.out.println("Vehicle name from Spring Context is"+veh.getName());
	}

}
