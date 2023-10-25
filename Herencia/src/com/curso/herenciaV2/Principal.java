package com.curso.herenciaV2;

public class Principal {
	
	public static void main(String[] args) {
		
		AguilaReal ar = new AguilaReal("Real");
		Aguila a = ar;
		AguilaCalva ac = (AguilaCalva) a;
		
		ac.volarAguilaCalva();  //ClassCastException
		
		//String cadena = (String)ar;

		
	}

}
