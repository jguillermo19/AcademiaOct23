package com.curso.v6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Principal {

	public static void main(String[] args) {
		
		System.out.println("removeIf");
		List<Student> students = new ArrayList<>();

		students.add(new Student("Junia", 20, 9.5));
		students.add(new Student("Ampliato", 22, 8.3));
		students.add(new Student("Estaquio", 19, 7.8));
		students.add(new Student("Herodion", 21, 8.6));
		students.add(new Student("Trifosa", 23, 9.1));
                
        System.out.println(students.getClass().getName());
        
        //students.add(new Student("Junia", 20, 9.5));
        
        students.removeIf(s -> s.getPromedio()<8.5);
        
        students.forEach(System.out::println);
       
        
	}
	
	
}
