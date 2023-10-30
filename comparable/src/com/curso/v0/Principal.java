package com.curso.v0;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		String[] arregloString = {"uno","dos","tres"};
		
		Arrays.sort(arregloString);
		
		System.out.println(Arrays.toString(arregloString));
		
		//En Java8 StringBuilder NO IMPLEMENTA Comparable.
		//En Java11 StringBuilder SI IMPLEMENTA Comparable.
		StringBuilder[] arregloSB = {new StringBuilder("uno"),
				new StringBuilder("cinco"),
				new StringBuilder("tres")};
		
		Arrays.sort(arregloSB);
		
		System.out.println(Arrays.toString(arregloSB));
		
		Student[] students = new Student[5];

        students[0] = new Student("Alice", 20, 9.5);
        students[1] = new Student("Bob", 22, 8.3);
        students[2] = new Student("Charlie", 19, 7.8);
        students[3] = new Student("Diana", 21, 8.6);
        students[4] = new Student("Evan", 23, 9.1);
        
        Arrays.sort(students);
        
		System.out.println(Arrays.toString(students));

		
		
	}

}
