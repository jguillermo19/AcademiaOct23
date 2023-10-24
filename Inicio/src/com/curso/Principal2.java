package com.curso;

public class Principal2 {

	public static void main(String[] args) {
		
		boolean res;
		
		String x = "Hello World";
		String y = "Hello World";
		String z = "Hello World";
		String v = new String("Hello World");
		
		res = x.equals(v);
		System.out.println(res); //true 
		
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		
		res = sb1.equals(sb2); 
		System.out.println(res); //false 
		
		Pato pato1 = new Pato("Donald");
		Pato pato2 = new Pato("Donald");
		
		res = pato1.equals(pato2); // ==
		System.out.println("Patos: "+res); //true

		
		
	}

}
