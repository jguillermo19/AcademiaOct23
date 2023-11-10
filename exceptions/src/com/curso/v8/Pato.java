package com.curso.v8;

public class Pato implements AutoCloseable{
	
	String nombre;

	public Pato(String nombre) {
		this.nombre = nombre;
	}
	
	void volar() throws Exception {
		System.out.println("Pato Volar");
		throw new Exception("Error al volar");
	}
	
	void cerrarPato(){
		System.out.println("Cerrar Recurso Pato");
	}

	@Override
	public void close() throws Exception {
		cerrarPato();
	}

}
