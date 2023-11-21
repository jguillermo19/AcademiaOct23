package com.curso.v0;

import java.util.stream.Stream;

public class Principal0 {

	public static void main(String[] args) {

		Stream<Double> randoms = 
				Stream.generate(Math::random); 
		
		Stream<Integer> oddNumbers = 
				Stream.iterate(1, n -> n + 2);
		
		
	}

}
