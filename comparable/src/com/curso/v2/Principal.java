package com.curso.v2;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Student[] students = new Student[5];
        students[0] = new Student("Alice", 20, 9.5);
        students[1] = new Student("Bob", 22, 8.3);
        students[2] = new Student("Charlie", 19, 7.8);
        students[3] = new Student("Diana", 21, 8.6);
        students[4] = new Student("Evan", 23, 9.1);
        
        Arrays.sort(students);

        for (Student s : students)
        	System.out.println(s);
		
		
	}

}
