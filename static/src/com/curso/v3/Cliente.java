package com.curso.v3;

public class Cliente {
	
	String nombre;
	static int numEmpresa;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Rolas");
		
		getEmpresa();
		c1.getNombre();
		System.out.println(numEmpresa);
		System.out.println(c1.nombre);

	}
	
	String getNombre() {
		return nombre;
	}
	
	static int getEmpresa() {
		return numEmpresa;
	}
	
	static Cliente getInstance() {
		return new Cliente("Patrobas");
	}

}
