package com.curso.v1;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {

		//Stream<String> stream = Stream.of("w", "o", "l", "f");

		String[] array = new String[] { "l", "o", "b", "o" };
		Stream<String> stream = Stream.of(array);
		
		Optional<String> word = stream.reduce((s, c) -> s + c); 
		word.ifPresent(System.out::println);
	}

}
