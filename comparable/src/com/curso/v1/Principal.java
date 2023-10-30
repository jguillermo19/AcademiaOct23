package com.curso.v1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		int i ;
		
		String s1 = "uno";
		String s2 = "dos";
		String s3 = "tres";
		String s4 = "DOS";
		String s5 = "2";
		
//		i = s5.compareTo(s4);
//		System.out.println(i);
		
		String[] arregloString = {s1,s2,s3,s4,s5};
		Arrays.sort(arregloString);
		System.out.println(Arrays.toString(arregloString));
		
		Student[] students = new Student[5];
        students[0] = new Student("Alice", 20, 9.5);
        students[1] = new Student("Bob", 22, 8.3);
        students[2] = new Student("Charlie", 19, 7.8);
        students[3] = new Student("Diana", 21, 8.6);
        students[4] = new Student("Evan", 23, 9.1);
        
        //Arrays.sort(students);
		//System.out.println(Arrays.toString(students));

		
		
	}

}
