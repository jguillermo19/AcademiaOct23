package com.curso.v2;

public class Inyector {
	
//	static ComputadoraWindows cw = new ComputadoraWindows("XP");
//	static ComputadoraMac cm = new ComputadoraMac("Sierra");
//	static ComputadoraLinux cl = new ComputadoraLinux("Ubuntu 11.2");

	static void inyectarComputadora(Becario becario) {
		becario.compu = new ComputadoraWindows("XP");
	}

}
