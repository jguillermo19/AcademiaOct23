package com.curso.v3;

import java.util.function.UnaryOperator;

public class Principal2 {

public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo Java";
				
		String cadenaFinal = Utils.transforma
				(cadena2, x -> cadena1.concat(x));
				
		System.out.println(cadenaFinal);
	}
}
