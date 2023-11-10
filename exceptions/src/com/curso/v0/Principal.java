package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		int x = 4;
		int y = 0;
		
		int res = calcularDiv(x,y);
		
		System.out.println("Resultado: "+res);
		
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) {
		return x/y;
	}

}
