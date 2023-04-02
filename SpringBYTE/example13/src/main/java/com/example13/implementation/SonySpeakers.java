package com.example13.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import com.example13.interfaces.Speakers;

@Component
@Primary
public class SonySpeakers implements Speakers {

	public String makeSound() {
		
		return "playing music with Sony speakers ";
	}

}
