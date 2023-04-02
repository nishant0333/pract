package com.consumer;

import java.util.function.Consumer;

public class ToPrint {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("durga");
		c.accept("Durgesh");

	}

}
