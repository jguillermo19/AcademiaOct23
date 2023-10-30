package com.curso.v2;

import java.util.Arrays;
import java.util.Comparator;

class Principal {

	public static void main(String[] args) {
		
		//Clases Anominas
		Comparator<Student> comparatorAge = new Comparator<>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getEdad() - o2.getEdad();
			}	
		};
		
		Comparator<Student> comparatorName = new Comparator<>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getNombre().compareTo(o1.getNombre());
			}	
		};
		
		Comparator<Student> comparatorProm = new Comparator<>() {
			@Override
			public int compare(Student o1, Student o2) {
				return (int)(o1.getPromedio()*100 - o2.getPromedio()*100);
			}	
		};
		
		System.out.println("Clases Anonimas");
		Student[] students = new Student[5];

        students[0] = new Student("Junia", 20, 9.5);
        students[1] = new Student("Ampliato", 22, 8.3);
        students[2] = new Student("Estaquio", 19, 7.8);
        students[3] = new Student("Herodion", 21, 8.6);
        students[4] = new Student("Trifosa", 23, 9.1);
        
        Arrays.sort(students, comparatorAge);
        
        System.out.println("*** Por Edad***");
        
        for (Student s : students)
        	System.out.println(s);
        
        Arrays.sort(students, comparatorProm);
        
        System.out.println("*** Por Promedio***");
        
        for (Student s : students)
        	System.out.println(s);
        
        Arrays.sort(students, comparatorName);
        
        System.out.println("*** Por Nombre***");
        
        for (Student s : students)
        	System.out.println(s);

	}
}
