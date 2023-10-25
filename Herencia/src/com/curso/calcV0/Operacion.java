package com.curso.calcV0;

public class Operacion {
	
	private int x;
	private int y;
	
	public Operacion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int ejecuta() {
		return 0;
	}

	@Override
	public String toString() {
		return "Operacion [x=" + x + ", y=" + y + "]";
	}
	
	public int getX() {
		//Solo si tienes el perfil de ADMIN puedes ver el dato
		return x;
	}

	public void setX(int x) {
		if (x<0)
			System.out.println("Dato Incorrecto");
		else
			this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
