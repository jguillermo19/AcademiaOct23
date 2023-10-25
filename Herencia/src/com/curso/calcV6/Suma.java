package com.curso.calcV6;

public class Suma extends Operacion {
	
	public Suma(int x, int y) {
		super(x,y);
	}
	
	@Override
	int ejecuta() {
		return x+y;
	}
	
	double ejecutaSuma(double d1,double d2) {
		return d1+d2;
	}

	
}
