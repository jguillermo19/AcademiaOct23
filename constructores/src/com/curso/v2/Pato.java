package com.curso.v2;

public class Pato extends Object{
	
	//has-a
	String nombre;
	int edad;

	//OVERLODING (Sobrecarga)
	public Pato() {	
		this("Sin Nombre",10);		
		System.out.println("Constructor default");

	}
	
	public Pato(String nombre) {
		super();
		System.out.println("Constructor con un String");
		this.nombre = nombre;
	}  
	
	public Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
 
	

}
