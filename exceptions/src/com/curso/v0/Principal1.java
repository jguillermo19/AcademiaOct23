package com.curso.v0;

public class Principal1 {

	public static void main(String[] args) {
		int x = 4;
		int y = 0;
		int res = 0;
		
		try {
			res = calcularDiv(x,y);
		}catch(ArithmeticException e) {
			System.out.println("Se atrapo la exception ArithmeticException");
		}
		
		System.out.println("Resultado: "+res);
		
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) {
		return x/y;
	}

}
