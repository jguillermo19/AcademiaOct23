package com.curso;

public class Principal3 {

	public static void main(String[] args) {
		
		boolean res;
		
		//INMUTABLE
		String x = "Hello";
		
		x.concat(" World"); //Objeto sin referencia
		
		System.out.println(x); //Hello
		
		//MUTABLE
		StringBuilder sb1 = new StringBuilder("Hola");
		
		sb1.append(" Mundo");
		
		System.out.println(sb1); //Hola Mundo

		
		
	}

}
