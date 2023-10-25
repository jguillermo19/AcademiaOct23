package com.curso.herenciaV3;

import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
		
		Aguila a = getAguila();
		
		a.volarAguila();
		
		if (a instanceof AguilaReal)
			((AguilaReal)a).volarAguilaReal();
		
		if (a instanceof AguilaCalva)
			((AguilaCalva)a).volarAguilaCalva();
		
	}

	private static Aguila getAguila() {
		
		Aguila[] aguilas = {new Aguila("A")
				,new AguilaReal("AR")
				,new AguilaCalva("AC")};
		
		int i = new Random().nextInt(aguilas.length);
		
		return aguilas[i];
	}

}
