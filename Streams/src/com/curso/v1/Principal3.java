package com.curso.v1;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal3 {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(3, 5, 6);

		System.out.println(stream.reduce(1, (a, b) -> a*b));
	}

}
