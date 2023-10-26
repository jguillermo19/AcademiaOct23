package com.curso.absV3;

public class Resta extends OperacionAbstracta {
	
	public Resta(int x, int y) {
		super(x,y);
	}
	@Override
	public int ejecuta() {
		return x-y;
	}
	
}
