package com.curso.v2;

public class Becario {
	
	String nombre;
	int edad;
	
	//BAJO ACOPLAMIENTO
	//@AutoWired //SPRING
	Computadora compu; //INYECTAR

	public Becario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	void prenderComputadora() {
		System.out.println(nombre + ": prender Computadora");
		compu.encender();
	}

}
