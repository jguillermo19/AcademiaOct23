package com.curso.v0;

import java.util.*;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Principal4 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("monkey", "gorilla", "bonobo");

		Stream<String> s = list.parallelStream();
		
		s.findAny().ifPresent(System.out::println);  
	}

}
