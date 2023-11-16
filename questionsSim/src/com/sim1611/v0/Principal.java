package com.sim1611.v0;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		// Identify the correct statements about the following code:-
		List<Integer> values = Arrays.asList(2, 4, 6, 9, 4); // 1
		Predicate<Integer> check = i -> {
			// System.out.println("Checking");
			return i > 2; // 2
		};
		// Predicate even = (Object i)-> ((Integer)i)%2==0; //3
		Predicate<Integer> even = i -> i % 2 == 0;
		long l = values.stream().filter(check).filter(even).count(); // 4
		// System.out.println(l);

		// What will the following code print?
		List<Integer> str = Arrays.asList(1, 2, 3, 4);
		l = str.stream().filter(x -> {
			System.out.print(x + " ");
			return x > 2;
		}).count();
		System.out.println(l);
	}

}
