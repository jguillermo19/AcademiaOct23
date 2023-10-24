package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		String nombre = "Patrobas";
		
		for(int i=0; i< 10; i++) {
			
			nombre = nombre.concat(""+i);
			//nombre = nombre + i;
			
			System.out.println(nombre);
			
		}
		
		
	}

}
