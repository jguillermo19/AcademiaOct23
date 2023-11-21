package com.curso.v0;

import java.util.stream.Stream;

public class Principal1 {

	public static void main(String[] args) {

		Stream<String> s = 
				Stream.of("monkey", "gorilla", "bonobo");

		System.out.println(s.peek(System.out::println).count());
		
	}

}
