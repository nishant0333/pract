package com.example.Demo10.implementation;

import org.springframework.stereotype.Component;

import com.example.Demo10.Interface.Tyres;

@Component("mrf")
public class MrfTyres implements Tyres {

	@Override
	public String rotate() {
		
		return "move Vehicle with Mrf tyres";
	}

	@Override
	public String stop() {
		
		return "Stop Vehicle with MRF tyres";
	}

}
