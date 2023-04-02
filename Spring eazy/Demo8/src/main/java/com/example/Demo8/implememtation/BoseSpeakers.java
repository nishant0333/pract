package com.example.Demo8.implememtation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.Demo8.Interface.Speakers;

@Component
@Primary
public class BoseSpeakers implements Speakers {

	@Override
	public String makeSound() {
		
		return "make sound by BossSpeakers";
	}

}
