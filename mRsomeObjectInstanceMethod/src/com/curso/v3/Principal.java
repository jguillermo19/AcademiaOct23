package com.curso.v3;

import java.util.function.UnaryOperator;

public class Principal {

public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo Java";
		
		UnaryOperator<String> uo = x -> cadena1.concat(x);
		
		String cadenaFinal = Utils.transforma(cadena2, uo);
				
		System.out.println(cadenaFinal);
	}
}
