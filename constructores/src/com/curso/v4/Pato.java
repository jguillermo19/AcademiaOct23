package com.curso.v4;

public class Pato extends Ave{
	
	public Pato() {	
		super("SinNombre",5);
	}
	
	public Pato(String nombre) {
		super(nombre,5);
	}  
	
	public Pato(String nombre, int edad) {
		super(nombre,edad);
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
 
	

}
