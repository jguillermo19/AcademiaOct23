package com.curso.v7;

public class Principal {

	public static void main(String[] args) {
		
		Pato pato = new Pato("Donald");

		try{
			pato.volar();	
		}finally {
			//PROBLEMA
			//pato.cerrarPato();
		}
		
	}

}
