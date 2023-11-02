package com.curso.v0;

public class Principal0 {

	public static void main(String[] args) {
		Student studen1 = new Student("Junia", 15, 9.5);
		
		//DEFINO EL COMPORTAMIENTO DE PREDICADO
		Predicado pre1 = new Predicado() {
			@Override
			public boolean probar(Student stu) {
				return stu.getEdad() > 17;
			}
		};
		//EJECUTO LA CLASE ANONIMA
		boolean res = pre1.probar(studen1);
		
		System.out.println(res);
		
		
	}

}
