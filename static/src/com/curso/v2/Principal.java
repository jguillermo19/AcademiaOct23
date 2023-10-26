package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Pato.getContador()); //0

		Pato p1 = new Pato("Donald",8);
		Pato p2 = new Pato("Lucas",4);
		Pato p3 = new Pato("McPato",4);
		Pato p999 = new Pato("Otro Donald",4);
		
		System.out.println(p3.getContador()); 

	}
	
	public static void main(String[]... args) {
		
	}

}
