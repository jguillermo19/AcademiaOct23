package com.curso.absV3;

public class Exp extends OperacionAbstracta {
	
	public Exp(int x, int y) {
		super(x,y);
	}
	@Override
	public int ejecuta() {
		return (int)(Math.pow(x, y));	
	}
	
}
