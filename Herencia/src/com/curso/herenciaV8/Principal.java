package com.curso.herenciaV8;

public class Principal {

	public static void main(String[] args) {

		Pato pato = new Pato();
		
		pato.volar();
		System.out.println(pato.getTipo());
		
		System.out.println("************");
		
		System.out.println(((Ave)pato).tipo);

		
	}

}
