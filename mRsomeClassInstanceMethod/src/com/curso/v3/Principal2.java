package com.curso.v3;

public class Principal2 {

	public static void main(String[] args) {

		String cadena1 = "Hello ";
		String cadena2 = "World Java 999";

		String cadenaFinal = Utils.transforma(
				cadena1, cadena2, (cad1, cad2) -> cad1.concat(cad2));

		System.out.println(cadenaFinal);
	}
}
