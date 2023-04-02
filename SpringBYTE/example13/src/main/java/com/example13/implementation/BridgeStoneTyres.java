package com.example13.implementation;

import org.springframework.stereotype.Component;

import com.example13.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres{

	public String rotate() {
		
		return "Vehicle moving with BridgeStone tyres";
	}

}
