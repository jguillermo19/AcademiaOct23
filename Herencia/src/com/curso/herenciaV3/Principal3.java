package com.curso.herenciaV3;

import java.util.Random;

public class Principal3 {
	
	public static void main(String[] args) {
		
		Object a = getAguila();
		
		if (a instanceof Aguila)
			((Aguila)a).volarAguila();
		
		if (a instanceof AguilaReal)
			((AguilaReal)a).volarAguilaReal();
		
		if (a instanceof AguilaCalva)
			((AguilaCalva)a).volarAguilaCalva();
		
		if (a instanceof String)
			System.out.println(((String)a).length());
		if (a instanceof Integer)
			System.out.println(((Integer)a).intValue());
		if (a instanceof Object)
			System.out.println(((Object)a).hashCode());
		
	}

	private static Object getAguila() {
		
		Object[] aguilas = {new Aguila("A")
				,new AguilaReal("AR")
				,new AguilaCalva("AC")
				,new Integer(4)
				,"Java"
				,new Object()
		};
		
		int i = new Random().nextInt(aguilas.length);
		
		return aguilas[i];
	}

}
