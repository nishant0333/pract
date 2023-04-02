package com.example.Demo8.implememtation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.Demo8.Interface.Tyres;

@Component
@Primary
public class MichelinTyres implements Tyres {

	@Override
	public String rotate() {
		
		return "move with MichelinTyres";
	}

}
