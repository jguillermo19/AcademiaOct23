package com.curso.v0;

public class Principal1 {

	public static void main(String[] args) {
		boolean res;
		Student studen1 = new Student("Junia", 19, 5.5);
		
		//DEFINO EL COMPORTAMIENTO DE PREDICADO
		Predicado pre1 = new Predicado() {
			@Override
			public boolean probar(Student stu) {
				return stu.getEdad() > 17;
			}
		};
		//EJECUTO LA CLASE ANONIMA
		res = pre1.probar(studen1);
		
		System.out.println("MayorEdad: "+res);
		
		//DEFINO EL COMPORTAMIENTO DE PREDICADO
		Predicado pre2 = new Predicado() {
			@Override
			public boolean probar(Student stu) {
				return stu.getPromedio() > 6.5;
			}
		};
		//EJECUTO LA CLASE ANONIMA
		res = pre2.probar(studen1);
		
		System.out.println("Certificado: "+res);

		
		
	}

}
