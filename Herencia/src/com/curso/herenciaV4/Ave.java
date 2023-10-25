package com.curso.herenciaV4;

public class Ave {
	
	public String nombre;
	public String tipo = "Ave";
	
	public Ave(String nombre) {
		this.nombre = nombre;
	}

	void volar(){
		System.out.println("VOLAR AVE");
	}
	
	void volarAve(){
		System.out.println("Volar como Ave");
	}

}
