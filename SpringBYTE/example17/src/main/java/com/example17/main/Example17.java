package com.example17.main;

import com.example17.config.ProjectConfig;
import com.example17.model.Song;
import com.example17.services.VehicleServices;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example17 {

	public static void main(String[] args) {
		var text = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var vehicleServices = text.getBean(VehicleServices.class);
		System.out.println(vehicleServices.getClass());

		Song song = new Song();
		song.setTitle("Blank Space");
		song.setSingerName("Taylor Swift");
		boolean vehicleStarted = true;
		String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
		String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
		String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);

	}
}
