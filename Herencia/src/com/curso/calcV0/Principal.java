package com.curso.calcV0;

public class Principal {

	public static void main(String[] args) {

		Operacion o1 = new Operacion(8,4);
		
		//o1.x = 10;
		o1.setX(-10);
		
		//System.out.println(o1.x);
		System.out.println(o1.getX());
		
		
	}

}
