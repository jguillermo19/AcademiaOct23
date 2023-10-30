package com.curso.v3;

import java.util.Arrays;
import java.util.Comparator;

class Principal {

	public static void main(String[] args) {
		
		//LAMBDAS
		Comparator<Student> comparatorAge = (x, z) ->  x.getEdad() - z.getEdad();

		Comparator<Student> comparatorName = (pato1, pato2) -> pato1.getNombre().compareTo(pato2.getNombre());
		
		Comparator<Student> comparatorProm = (stu1, stu2) ->  (int)(stu1.getPromedio()*100 - stu2.getPromedio()*100);

		
		System.out.println("Lambdas");
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
