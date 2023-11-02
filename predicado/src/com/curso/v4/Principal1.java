package com.curso.v4;

import java.util.ArrayList;
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
                
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(students[0]);
        listStudents.add(students[1]);
        listStudents.add(students[2]);
        listStudents.add(students[3]);
        listStudents.add(students[4]);
        
        //DECLARATIVO
        //listStudents.forEach(System.out::println);
        
        //IMPERATIVA
        for(Student stu:listStudents)
        	System.out.println(stu);
        
        System.out.println("********");
        
        listStudents.removeIf(x -> x.getPromedio()<6.5);
        
        for(Student stu:listStudents)
        	System.out.println(stu);
		
	}

}
