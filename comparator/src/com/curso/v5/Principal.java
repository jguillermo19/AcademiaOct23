package com.curso.v5;

import java.util.Arrays;
import java.util.Comparator;

class Principal {

	public static void main(String[] args) {
		
		System.out.println("Lambdas V2");
		Student[] students = new Student[5];

        students[0] = new Student("Junia", 20, 9.5);
        students[1] = new Student("Ampliato", 22, 8.3);
        students[2] = new Student("Estaquio", 19, 7.8);
        students[3] = new Student("Herodion", 21, 8.6);
        students[4] = new Student("Trifosa", 23, 9.1);
       
        System.out.println("*** Por Edad***");        
        showStudents(students, (x, z) ->  x.getEdad() - z.getEdad() );
        
        System.out.println("*** Por Promedio***");
        showStudents(students, 
        		(stu1, stu2) ->  (int)(stu2.getPromedio()*100 - stu1.getPromedio()*100) );
         
        System.out.println("*** Por Nombre***");
        showStudents(students, (
        		pato1, pato2) -> pato1.getNombre().compareTo(pato2.getNombre()));


	}
	
	static void showStudents(Student[] arregloEstudiantes, 
			Comparator<Student> comparador ) {
		
		Arrays.sort(arregloEstudiantes, comparador);
                
        for (Student s : arregloEstudiantes)
        	System.out.println(s);
		
	}
}
