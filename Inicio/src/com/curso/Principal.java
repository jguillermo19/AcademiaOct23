package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		//PRIMITIVOS (PROCEDURAL)
		// if, for, while, doWhile, case, etc..
		
		int i1 = 8;
		int i2 = 8;
		
		boolean resPri = (i1 == i2); //false
		// == son el mismo dato?
		
		//resPri = i1.equals(i2);
		
		//POOL DE STRINGS
		String x = "Hello World";
		String y = "Hello World";
		String z = "Hello World";
		
		//1 Objeto //3 Variables Referencia
		
		String v = new String("Hello World X");
		v = v.intern();
		String w = new String("Hello World");
		
		//3 Objetos // 5 Variables Referencia
		
		boolean res = (x == v); //true; 
		// == Mis referencias apuntan al mismo objeto?
		System.out.println(res);
	
		res = v.equals(x); //false
		
		
		
		
		
		
	}

}
