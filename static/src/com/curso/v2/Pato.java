package com.curso.v2;

public class Pato {
	
	String nombre;
	int edad;
	public static int contador;
	
	Pato(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		++contador;
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + ", contador=" + contador + "]";
	}
 
	public static int getContador() {
		return contador;
	}
	
	

}
