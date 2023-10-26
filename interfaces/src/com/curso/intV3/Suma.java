package com.curso.intV3;

public class Suma implements Operacion{
	
	int x;
	int y;
	
	public Suma(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int ejecuta() {
		return x+y;
	}
	
	@Override
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void ejecutaReales() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejecutaImaginarios() {
		// TODO Auto-generated method stub
		
	}
	
}