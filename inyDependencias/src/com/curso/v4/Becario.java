package com.curso.v4;

public class Becario {
	
	private String nombre;
	private int edad;
	
	//BAJO ACOPLAMIENTO
	//@AutoWired //SPRING
	private Computadora compu; //INYECTAR POR UN SETTER

	public Becario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	void prenderComputadora() {
		System.out.println(nombre + ": prender Computadora");
		compu.encender();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Computadora getCompu() {
		return compu;
	}

	public void setCompu(Computadora compu) {
		this.compu = compu;
	}

}
