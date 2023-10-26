package com.curso.absV3;

public class Div extends OperacionAbstracta {
	
	public Div(int x, int y) {
		super(x,y);
	}
	@Override
	public int ejecuta() {
		return x/y;
	}
	
}
