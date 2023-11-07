package com.curso.v1;

public class Becario {
	
	String nombre;
	int edad;
	
	//ALTO ACOPLAMIENTO
	ComputadoraWindows cw;
	ComputadoraLinux cl;
	ComputadoraMac cm;

	public Becario(String nombre, int edad, char tc) {
		this.nombre = nombre;
		this.edad = edad;
		if (tc=='W')
			cw = new ComputadoraWindows("XP");
		else if (tc=='M')
			cm = new ComputadoraMac("Sierra");
		else
			cl = new ComputadoraLinux("Ubuntu 11.2");
	}
	
	void prenderComputadora() {
		System.out.println(nombre + ": prender Computadora");
		if (cw!=null) 
			cw.encender();
		else if (cm!=null) 
			cm.encender();
		else
			cl.encender();
		
	}

}
