package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Component c1 = new LeafConstante(5.0);
//		double d1 = c1.operation();
//		System.out.println(d1);
		
		Component c2 = new LeafConstante(8.0);
//		double d2 = c2.operation();
//		System.out.println(d2);
		
		Component c3 = new CompositeSuma(c1,c2);
		double d3 = c3.operation();
		System.out.println(c3);
		
		
	}

}
