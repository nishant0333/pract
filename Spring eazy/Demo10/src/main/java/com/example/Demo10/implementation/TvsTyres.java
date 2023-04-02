package com.example.Demo10.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.Demo10.Interface.Tyres;

@Component("tvs")
@Primary
public class TvsTyres implements Tyres {

	@Override
	public String rotate() {
		
		return "move Vehicle with TVS tyres";
	}

	@Override
	public String stop() {
		
		return "Stop Vehicle with TVS tyres";
	}

}
