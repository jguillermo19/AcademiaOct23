package com.curso.v0;

public class Persona {
	
	private int id;
	private String nombre;
	
	Persona(){
		nombre = "Sin nombre";
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

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
