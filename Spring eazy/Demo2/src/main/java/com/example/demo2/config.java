package com.example.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example.demo2")
public class config {

	@Bean("Ram")
	public Person getPerson() {
		Person person=new Person();
		person.setId(101);
		person.setName("Ram");
		return person;
	}
	@Bean("ganesh")
	@Primary
	public Person getPerson1() {
		Person person=new Person();
		person.setId(102);
		person.setName("Ganesh");
		return person;
		
	}
}
