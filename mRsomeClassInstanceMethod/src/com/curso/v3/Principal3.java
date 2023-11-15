package com.curso.v3;

public class Principal3 {

	public static void main(String[] args) {

		String cadena1 = "Hello ";
		String cadena2 = "World Phyton 999";

		String cadenaFinal = Utils.transforma(
				cadena1, cadena2, String::concat);

		System.out.println(cadenaFinal);
	}
}
