package com.curso.v5;

public class Inyector {
	
static ComputadoraLinux cl = new ComputadoraLinux("Ubuntu 11.2");

	static Becario inyectarComputadora(String nombre, int edad, char t) {
		if (t=='W')
			return new Becario(nombre,edad,new ComputadoraWindows("XP")); 
		else if (t=='M')
			return new Becario(nombre,edad,new ComputadoraMac("Sierra"));
		else
			return new Becario(nombre,edad,new ComputadoraLinux("Ubuntu 11.2"));
	}

}
