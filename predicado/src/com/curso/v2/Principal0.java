package com.curso.v2;

public class Principal0 {

	public static void main(String[] args) {
		boolean res;
		Student studen1 = new Student("Junias", 19, 7.5);
		
		//DEFINO LA LAMBDA
		Predicado<Student> pre1 = stu -> stu.getEdad() > 17;
			
		//EJECUTA LA LAMBDA
		res = pre1.probar(studen1);
		
		System.out.println("MayorEdad: "+res);
		
		//DEFINO LA LAMBDA
		Predicado<Student> pre2 = stu -> stu.getPromedio() > 6.5;
			
		//EJECUTA LA LAMBDA
		res = pre2.probar(studen1);
		
		System.out.println("Certificado: "+res);
		
		//LONGITUD DE NOMBRE MAYOR A 5
		
		Predicado<String> pre3 = cadena -> cadena.length() > 5;
		res = pre3.probar(studen1.getNombre());
		System.out.println("Nombre long > 5?: "+res);


		
		
	}

}
