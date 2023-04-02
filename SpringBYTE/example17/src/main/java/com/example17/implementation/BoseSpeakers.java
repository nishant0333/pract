package com.example17.implementation;

import com.example17.interfaces.Speakers;
import com.example17.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
	
	  public String makeSound(Song song){ return "Playing the song "+
	  song.getTitle()+ " by " + song.getSingerName()+ " with Bose speakers"; }
	 

	
}
