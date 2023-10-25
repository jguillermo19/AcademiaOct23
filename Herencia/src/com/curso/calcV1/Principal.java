package com.curso.calcV1;

public class Principal {
	
	public static void main(String[] args) {
		int resultado;
		
		Operacion o1 = new Operacion(8,4);
		resultado = o1.ejecuta();
		System.out.println(o1);
		System.out.println(resultado);
		
		Suma o2 = new Suma(8,4);
		resultado = o2.ejecuta();
		System.out.println(o2);
		System.out.println(resultado);
		
		Resta o3 = new Resta(8,4);
		resultado = o3.ejecuta();
		System.out.println(o3);
		System.out.println(resultado);
		
		Multi o4 = new Multi(8,4);
		resultado = o4.ejecuta();
		System.out.println(o4);
		System.out.println(resultado);
	}

}
