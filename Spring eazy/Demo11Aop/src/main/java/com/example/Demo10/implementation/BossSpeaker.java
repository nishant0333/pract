package com.example.Demo10.implementation;

import org.springframework.stereotype.Component;

import com.example.Demo10.Interface.Speakers;
import com.example.Demo10.model.Songs;

@Component("Boss")
public class BossSpeaker implements Speakers {

	@Override
	public String makeSound(Songs song) {
		
		return "play song name" +song.getTital()+"by"+song.getSingerName()+"from BossSpeakers";
	}

}
