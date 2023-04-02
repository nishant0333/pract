package com.example13.implementation;

import org.springframework.stereotype.Component;

import com.example13.interfaces.Speakers;

@Component
public class BoseSpeakers implements Speakers {

	public String makeSound() {
		
		return "playing music with Boss speakers";
	}

}
