package com.consumer;

import java.util.function.Consumer;

class Movie {
	String name;

	public Movie(String name) {
		this.name = name;
	}

}

public class ConsumerChaining {

	public static void main(String[] args) {
		Movie m1 = new Movie("spiderman");
		Consumer<Movie> c1 = m -> System.out.println(m.name + " ready to release");
		Consumer<Movie> c2 = m -> System.out.println(m.name + " released but it is biggest folpe");
		Consumer<Movie> c3 = m -> System.out.println(m.name + " storing information in database");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		cc.accept(m1);
	}

}
