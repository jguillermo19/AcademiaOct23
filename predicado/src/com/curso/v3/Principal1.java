package com.curso.v3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Principal1 {

	public static void main(String[] args) {
		
		Student[] students = new Student[5];

        students[0] = new Student("Junia", 20, 9.5);
        students[1] = new Student("Ampliato", 15, 8.3);
        students[2] = new Student("Estaquio", 19, 5.8);
        students[3] = new Student("Herodion", 17, 8.6);
        students[4] = new Student("Trifosa", 23, 1.1);
        
        List<Student> listStudents = Arrays.asList(students);
        
        //Student[] studentsOtra = (Student[])listStudents.toArray();
        
        System.out.println("Certificado?");
                          //DEFINICION DE LA LAMBDA
        show(listStudents,stu -> stu.getPromedio() > 6.5);
        
        System.out.println("Mayor de Edad?");
        				  //DEFINICION DE LA LAMBDA
        show(listStudents,stu -> stu.getEdad() > 18);
		
	}

	private static void show(List<Student> listStudents, 
			Predicate<Student> pre) {
		
		boolean res;
		for(Student stu: listStudents) {
			//EJECUTANDO LA LAMBDA
			res = pre.test(stu);
			System.out.println(stu+" : "+res);
		}
	}

}
