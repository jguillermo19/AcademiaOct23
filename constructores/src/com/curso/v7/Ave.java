package com.curso.v7;

public class Ave {
	
	String nombre = "Name Ave";
	int edad = 10;
	
	Ave(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return  this.getClass().getSimpleName()
				+"[nombre=" + nombre + ", edad=" + edad + "]";
	}


}
