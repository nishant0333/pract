package com.example.Demo8.implememtation;

import org.springframework.stereotype.Component;

import com.example.Demo8.Interface.Tyres;

@Component("bridge")
public class BridgeStoneTyres implements Tyres{

	@Override
	public String rotate() {
		
		return "move with BtidgeStoneTyres";
	}

}
