package com.curso.v0;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Student[] students = new Student[5];

        students[0] = new Student("Junia", 20, 9.5);
        students[1] = new Student("Ampliato", 22, 8.3);
        students[2] = new Student("Estaquio", 19, 7.8);
        students[3] = new Student("Herodion", 21, 8.6);
        students[4] = new Student("Trifosa", 23, 9.1);
        
        Arrays.sort(students, new ComparatorEdad());
        
        System.out.println("*** Por Edad***");
        
        for (Student s : students)
        	System.out.println(s);
        
        Arrays.sort(students, new ComparatorPromedio());
        
        System.out.println("*** Por Promedio***");
        
        for (Student s : students)
        	System.out.println(s);
        
        Arrays.sort(students, new ComparatorNombre());
        
        System.out.println("*** Por Nombre***");
        
        for (Student s : students)
        	System.out.println(s);

		
		
	}

}
