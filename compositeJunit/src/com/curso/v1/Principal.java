package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Component c1 = new LeafConstante(5.0);	
		Component c2 = new LeafConstante(8.0);
		Component c3 = new LeafConstante(2.0);

		Component c4 = new CompositeSuma(c1,c2);
		Component c5 = new CompositeSuma(c4,c3);
		
		System.out.println(c5.operation());

		
	}

}
