package com.curso.v4;

public class Inyector {
	
static ComputadoraLinux cl = new ComputadoraLinux("Ubuntu 11.2");

	static void inyectarComputadora(Becario becario, char t) {
		if (t=='W')
			becario.setCompu(new ComputadoraWindows("XP")); 
		else if (t=='M')
			becario.setCompu(new ComputadoraMac("Sierra"));
		else
			becario.setCompu(new ComputadoraLinux("Ubuntu 11.2"));
	}

}
