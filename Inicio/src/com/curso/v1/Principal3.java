package com.curso.v1;

public class Principal3 {
	
	public static void main(String[] args) {
		
		final int x = 8;
		//x = 16;
		System.out.println(x);
		
		final String cadena = "Hola";
		
		cadena.concat(" Mundo");
		
		System.out.println(cadena); //Hola
		
		
		final StringBuilder sb = new StringBuilder("Hello");
		
		sb.append(" World");
		
		//sb = null;
		
		System.out.println(sb); //Hello World
		
	}
	
	

}
