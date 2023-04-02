package com.example.Demo8.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.BeanDefinition;
import com.example.Demo8.Interface.Speakers;
import com.example.Demo8.Interface.Tyres;

@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleServices {

	@Autowired
	@Qualifier("sony")
	private Speakers speaker;
	@Autowired
	@Qualifier("bridge")
	private Tyres tyres;
	
	public void playMusic() {
		String music = speaker.makeSound();
		System.out.println(music);
	}
	
	public void moveVehicle() {
		
		String move = tyres.rotate();
		System.out.println(move);
	}
	
	
	public Tyres getTyres() {
		return tyres;
	}
	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}
	public Speakers getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speakers speaker) {
		this.speaker = speaker;
	}

	@Override
	public String toString() {
		return "VehicleServices [speaker=" + speaker + ", tyres=" + tyres + "]";
	}
	
}
