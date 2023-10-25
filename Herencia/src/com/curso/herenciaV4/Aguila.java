package com.curso.herenciaV4;

public class Aguila extends Ave {

	//HIDDEN
	public String tipo = "Aguila";

	public Aguila(String nombre) {
		super(nombre);
	}
	
	@Override
	void volar() {
		System.out.println("Aguila Override volar");
	}
	
	void volarAguila(){
		System.out.println("Volar como Aguila");
	}

}
