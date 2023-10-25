package com.curso.herenciaV3;

public class Ave {
	
	public String nombre;
	
	public Ave(String nombre) {
		this.nombre = nombre;
	}

	void volar(){
		System.out.println("Volar");
	}
	
	void volarAve(){
		System.out.println("Volar como Ave");
	}

}
