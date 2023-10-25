package com.curso.herenciaV4;

public class AguilaReal extends Aguila {
	
	public String tipo = "AguilaReal";

		
	public AguilaReal(String nombre) {
		super(nombre);
	}
	
	void volarAguilaReal(){
		System.out.println("Volar como Aguila Real");
	}
	
	@Override
	void volar() {
		System.out.println("AguilaReal Override volar");
	}

}
