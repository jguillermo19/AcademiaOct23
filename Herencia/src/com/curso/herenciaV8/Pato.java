package com.curso.herenciaV8;

public class Pato extends Ave {
	
	String tipo = "Pato";
	
	Pato(){
		super();
	}
	
	void volar() {
		super.volar();
		System.out.println("Pato volar");
	}

	String getTipo() {
		return super.tipo;
	}
}
