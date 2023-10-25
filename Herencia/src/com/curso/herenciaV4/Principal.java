package com.curso.herenciaV4;


public class Principal {
	
	public static void main(String[] args) {
		
		Ave a1 = new Ave("Ave");
		Ave a2 = new Aguila("Aguila");
		Ave a3 = new AguilaReal("AguilaReal");
		Ave a4 = new AguilaCalva("AguilaCalva");
		
		System.out.println(a1.tipo);
		a1.volar(); 
		System.out.println(((Aguila)a2).tipo);
		a2.volar(); 
		System.out.println(((AguilaReal)a3).tipo);
		a3.volar();
		System.out.println(((AguilaCalva)a4).tipo);
		a4.volar(); 


		
	}

	
}
