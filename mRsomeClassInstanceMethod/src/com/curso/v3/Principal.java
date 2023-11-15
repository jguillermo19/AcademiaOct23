package com.curso.v3;

import java.util.function.BinaryOperator;

public class Principal {

public static void main(String[] args) {
		
		String cadena1 = "Hello ";
		String cadena2 = "World Java";
		
		BinaryOperator<String> bo = (cad1,cad2) -> cad1.concat(cad2);
		
		String cadenaFinal = Utils.transforma(cadena1, cadena2, bo);
				
		System.out.println(cadenaFinal);
	}
}
