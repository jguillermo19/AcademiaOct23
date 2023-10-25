package com.curso.herenciaV4;

public class AguilaCalva extends Aguila {
	
	public String tipo = "AguilaCalva";

		
	public AguilaCalva(String nombre) {
		super(nombre);
	}
	
	@Override
	void volar() {
		System.out.println("AguilaCalva Override volar");
	}
	
	void volarAguilaCalva(){
		System.out.println("Volar como Aguila Calva");
	}

}
