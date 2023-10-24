package com.curso.cert01;

public class PrincipalPato {
	
	public static void main(String[] args) {
		Pato pato1 = new Pato();
		
		pato1.nombre = "Donald";
		pato1.edad = 5;
		
		//pato1 = null;
		
		System.out.println(pato1.nombre+", "+pato1.edad);
		pato1.volar();
	}

}
