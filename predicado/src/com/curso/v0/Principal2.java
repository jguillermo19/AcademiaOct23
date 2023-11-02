package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {
		boolean res;
		Student studen1 = new Student("Junia", 19, 7.5);
		
		//DEFINO LA LAMBDA
		Predicado pre1 = stu -> stu.getEdad() > 17;
			
		//EJECUTA LA LAMBDA
		res = pre1.probar(studen1);
		
		System.out.println("MayorEdad: "+res);
		
		//DEFINO LA LAMBDA
		Predicado pre2 = stu -> stu.getPromedio() > 6.5;
			
		//EJECUTA LA LAMBDA
		res = pre2.probar(studen1);
		
		System.out.println("Certificado: "+res);

		
		
	}

}
