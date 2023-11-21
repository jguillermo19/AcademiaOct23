package com.curso.v0;

import java.util.stream.Stream;

public class Principal5 {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");

		s.max((x,y) -> x.length() - y.length()).ifPresent(System.out::println);
		
		//s = Stream.of("monkey", "gorilla", "bonobo");
		
		s.findAny().ifPresent(System.out::println); // monkey 
		
	}

}
