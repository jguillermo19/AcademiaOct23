package com.curso.herenciaV3;

import java.util.Random;

public class Principal2 {
	
	public static void main(String[] args) {
		
		System.out.println("Principal2");
		
		Aguila a = new Principal2().getAguila();
		
		a.volarAguila();
		
		if (a instanceof AguilaReal)
			((AguilaReal)a).volarAguilaReal();
		
		if (a instanceof AguilaCalva)
			((AguilaCalva)a).volarAguilaCalva();
		
	}

	private Aguila getAguila() {
		
		Aguila[] aguilas = {new Aguila("A")
				,new AguilaReal("AR")
				,new AguilaCalva("AC")};
		
		int i = new Random().nextInt(aguilas.length);
		
		return aguilas[i];
	}

}
