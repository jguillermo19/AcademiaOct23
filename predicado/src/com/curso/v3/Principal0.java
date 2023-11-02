package com.curso.v3;

import java.util.function.Predicate;

public class Principal0 {

	public static void main(String[] args) {
		System.out.println("Predicate");
		boolean res;
		Student studen1 = new Student("Junias", 19, 7.5);
		
		//DEFINO LA LAMBDA
		Predicate<Student> pre1 = stu -> stu.getEdad() > 17;
			
		//EJECUTA LA LAMBDA
		res = pre1.test(studen1);
		
		System.out.println("MayorEdad: "+res);
		
		//DEFINO LA LAMBDA
		Predicate<Student> pre2 = stu -> stu.getPromedio() > 6.5;
			
		//EJECUTA LA LAMBDA
		res = pre2.test(studen1);
		
		System.out.println("Certificado: "+res);
		
		//LONGITUD DE NOMBRE MAYOR A 5
		
		Predicate<String> pre3 = cadena -> cadena.length() > 5;
		res = pre3.test(studen1.getNombre());
		System.out.println("Nombre long > 5?: "+res);

		
	}

}
