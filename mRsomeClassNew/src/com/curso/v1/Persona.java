package com.curso.v1;

public class Persona {
	
	private int id;
	private String nombre;
	private double promedio;
	
	Persona(){
		nombre = "Not Name";
		System.out.println("Constructor 0 Parámetros");
	}
	
	Persona(int id) {
		this.id = id;
		nombre = "Sin nombre";
		System.out.println("Constructor 1 Parámetro");
	}

	
	Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		System.out.println("Constructor 2 Parámetros");
	}
	
	Persona(int id, String nombre,double promedio) {
		this.id = id;
		this.nombre = nombre;
		this.promedio = promedio;
		System.out.println("Constructor 3 Parámetros");
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
