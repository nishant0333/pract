package com.example.Demo10.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Demo10.config.ConfigBean;
import com.example.Demo10.model.Songs;
import com.example.Demo10.service.VehicleService;

public class Demo10Main {

	public static void main(String[] args) {
	ApplicationContext ctx=new	AnnotationConfigApplicationContext(ConfigBean.class);
		VehicleService vehicleServices = ctx.getBean(VehicleService.class);
		System.out.println(vehicleServices.getClass());

		Songs song = new Songs();
		song.setTital("Blank Space");
		song.setSingerName("Taylor Swift");
		boolean vehicleStarted = true;
		String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
		String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
		String applyBrakeStatus = vehicleServices.applyBreak(vehicleStarted);

	}

}
