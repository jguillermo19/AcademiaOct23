package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {

		System.out.println(
		new Principal2().getCantLetras("JavaFunctional"));
		
		System.out.println(
		new Principal2().esMayor10(4,5));
	}
	
	int getCantLetras(String s) {
		return s.length();
	}

	boolean esMayor10(int x, int y) {
		return (x+y) > 10;
	}
}

