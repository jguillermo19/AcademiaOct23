package com.curso.v0;

public class Becario {
	
	String nombre;
	int edad;
	
	ComputadoraWindows cw;

	public Becario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		cw = new ComputadoraWindows("XP");
	}
	
	void prenderComputadora() {
		System.out.println(nombre + ": prender Computadora");
		cw.encender();
	}

}
