package com.curso.v3;

public class Pato extends Ave{
	
	String nombre; //hidden
	int edad; //hidden

	public Pato() {	
		super("SinNombre",5);
	}
	
	public Pato(String nombre) {
		super(nombre,5);
		this.nombre = nombre;
	}  
	
	public Pato(String nombre, int edad) {
		super(nombre,edad);
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
 
	

}
