package com.curso.v5;

public class Becario {
	
	private String nombre;
	private int edad;
	private Computadora compu;
	
	public Becario(String nombre, int edad, Computadora compu) {
		this.nombre = nombre;
		this.edad = edad;
		//@Autowired
		this.compu = compu;
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

}
