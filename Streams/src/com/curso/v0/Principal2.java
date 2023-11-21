package com.curso.v0;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "ape", "bonobox");
		
		//Lambda
		Comparator<String> comp = (s1, s2) -> s1.length()-s2.length();

		Optional<String> max = s.max(comp); 
		
		Consumer<String> cons = t -> System.out.println(t);
		
		max.ifPresent(cons); 
	}

}
