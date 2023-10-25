package com.curso.calcV5;

public class Div extends Operacion {
	
	public Div(int x, int y) {
		super(x,y);
	}
	@Override
	int ejecuta() {
		return x/y;
	}
	
}
