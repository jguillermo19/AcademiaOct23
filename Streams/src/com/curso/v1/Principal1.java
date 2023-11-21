package com.curso.v1;

import java.util.stream.Stream;

public class Principal1 {

	public static void main(String[] args) {

		//Stream<String> stream = Stream.of("w", "o", "l", "f");

		String[] array = new String[] { "l", "o", "b", "o","s" };
		Stream<String> stream = Stream.of(array);
		
		//String word = stream.reduce("", (s, c) -> s + c); 
		String word = stream.reduce("", String::concat); 

		System.out.println(word); // lobos
	}

}
