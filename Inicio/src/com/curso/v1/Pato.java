package com.curso.v1;

//Una clase Final no puede ser heredada
public class Pato {
	
	String nombre;

	public Pato(String nombre) {
		this.nombre = nombre;
	}
	
	//Final no puede ser Sobreescrito (Override)
	void volar(){
		System.out.println("Volar como Pato");
	}
	
}
