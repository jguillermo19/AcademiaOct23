package com.curso.v0;

public class Pato {
	
	String nombre;
	int edad;
	private static int contador;
	
	Pato(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		++contador;
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + ", contador=" + contador + "]";
	}
 
	static int getContador() {
		return contador;
	}
	

}
