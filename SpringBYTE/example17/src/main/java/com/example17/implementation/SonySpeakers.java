package com.example17.implementation;


import com.example17.interfaces.Speakers;
import com.example17.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

	 public String makeSound(Song song){
	        return "Playing the song "+ song.getTitle()+ " by "
	                + song.getSingerName()+
	                " with Sony speakers";
	    }

}
