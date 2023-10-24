package com.curso.v1;

public class Principal2 {

	public static void main(String[] args) {

		StringBuilder nombre = new StringBuilder("Patrobas");
		
		for(int i=0; i< 10; i++) {
			
			nombre = nombre.append(i);
			
			System.out.println(nombre);
			
		}
		
		String nombreString = nombre.toString();
	}

}
