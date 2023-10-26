package com.curso.absV3;

public class Suma extends OperacionAbstracta {
	
	public Suma(int x, int y) {
		super(x,y);
	}

	@Override
	public int ejecuta() {
		return x+y;
	}
	
	public int ejecutaSuma() {
		System.out.println("paso por Ejecuta Suma");
		return x+y;
	}
	
}
