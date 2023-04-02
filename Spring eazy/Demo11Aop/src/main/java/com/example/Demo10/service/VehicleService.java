package com.example.Demo10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Demo10.Interface.LogAspect;
import com.example.Demo10.Interface.Speakers;
import com.example.Demo10.Interface.Tyres;
import com.example.Demo10.model.Songs;

@Component
public class VehicleService {

	@Autowired
	private Speakers speaker;
	@Autowired
	private Tyres tyre;
	
	//@LogAspect
	public String playMusic(boolean vehicleStarted , Songs song) {
		
	return speaker.makeSound(song);	
	}
	
	public String moveVehicle(boolean vehicleStarted) {
		
		return tyre.rotate();
	}
	
	public String applyBreak(boolean vehicleStarted) {
		
		return tyre.stop();
	}
	
	public Speakers getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speakers speaker) {
		this.speaker = speaker;
	}
	public Tyres getTyre() {
		return tyre;
	}
	public void setTyre(Tyres tyre) {
		this.tyre = tyre;
	}
}
