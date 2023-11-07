package com.curso.v3;

public class Inyector {
	
static ComputadoraLinux cl = new ComputadoraLinux("Ubuntu 11.2");

	static void inyectarComputadora(Becario becario, char t) {
		if (t=='W')
			becario.compu = new ComputadoraWindows("XP");
		else if (t=='M')
			becario.compu = new ComputadoraMac("Sierra");
		else
			becario.compu = new ComputadoraLinux("Ubuntu 11.2");
	}

}
