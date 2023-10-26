package com.curso.absV3;

public class Multi extends OperacionAbstracta {
	
	public Multi(int x, int y) {
		super(x,y);
	}
	@Override
	public int ejecuta() {
		return x*y;
	}
	
}
