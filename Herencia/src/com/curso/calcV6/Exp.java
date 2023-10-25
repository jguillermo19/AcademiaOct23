package com.curso.calcV6;

public class Exp extends Operacion {
	
	public Exp(int x, int y) {
		super(x,y);
	}
	@Override
	int ejecuta() {
		return (int)(Math.pow(x, y));	
	}
	
}
