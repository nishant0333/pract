package com.example11.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example11.beans.Person;
import com.example11.beans.Vehicle;
import com.example11.config.projectConfig;



public class Example11 {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(projectConfig.class);
Vehicle vehicle=ctx.getBean(Vehicle.class);
Person person=ctx.getBean(Person.class);

System.out.println("person name from Context is : " + person.getName());
System.out.println(person.mi());
System.out.println("Vehicle Name from spring Context is :"+ vehicle.getName());
System.out.println("Vehicle that person own is : "+person.getVehicle());
	}

}
