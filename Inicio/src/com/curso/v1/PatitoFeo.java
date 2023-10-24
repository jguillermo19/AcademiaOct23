package com.curso.v1;

public class PatitoFeo extends Pato {
	
	public PatitoFeo(String nombre) {
		super(nombre);
	}
	
	@Override
	void volar(){
		System.out.println("Volar como Patito feo");
	}
	
}
