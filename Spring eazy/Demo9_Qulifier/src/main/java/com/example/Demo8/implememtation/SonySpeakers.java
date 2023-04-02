package com.example.Demo8.implememtation;

import org.springframework.stereotype.Component;

import com.example.Demo8.Interface.Speakers;

@Component("sony")
public class SonySpeakers implements Speakers {

	@Override
	public String makeSound() {
		
		return "make sound with Sony Speakers";
	}

}
