package com.curso.v6;

public class Pato extends Ave{
	
	String nombre = "Name Pato";
	int edad = 20;
	
	Pato(String nombre, int edad){
		super(nombre, edad);
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
 
	

}
