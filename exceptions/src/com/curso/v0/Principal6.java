package com.curso.v0;

public class Principal6 {

	public static void main(String[] args) {
		int x = 4;
		int y = 0;
		int res = 0;
		
		res = calcularDiv(x,y);
		
		System.out.println("Resultado: "+res);
		
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) {
		try {
			return x/y;
		}finally {
			System.out.println("Paso por Finally");
		}
		//return 0;
		
	}

}
