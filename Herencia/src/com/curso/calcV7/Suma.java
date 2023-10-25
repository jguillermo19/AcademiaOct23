package com.curso.calcV7;

public class Suma extends Operacion {
	
	public Suma(int x, int y) {
		super(x,y);
	}
	
	@Override
	int ejecuta() {
		return x+y;
	}
	
	double ejecuta(double d1,double d2) {
		return d1+d2;
	}

	
}
