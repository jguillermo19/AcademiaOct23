package com.curso.v0;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class Principal6 {

	public static void main(String[] args) {

		
		List<String> list = Arrays.asList("monkey", "2", "chimp"); 
		
		Stream<String> infinite = Stream.generate(() -> "chimp"); 
		
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		
		//System.out.println(list.stream().anyMatch(pred)); //true
		
		//System.out.println(list.stream().allMatch(pred)); //false
		
		//System.out.println(list.stream().noneMatch(pred)); //false
		
		System.out.println(infinite.peek(x -> System.out.println("PASO"))
									.anyMatch(pred)); //true
	}

}
