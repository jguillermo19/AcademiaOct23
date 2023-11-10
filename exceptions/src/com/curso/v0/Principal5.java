package com.curso.v0;

public class Principal5 {

	public static void main(String[] args) {
		int x = 4;
		int y = 0;
		int res = 0;
		
		res = calcularDiv(x,y);
		
		System.out.println("Resultado: "+res);
		
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) {
		int resultado = 0;
		try {
			resultado = x/y;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Paso por Finally");
		}
		return resultado;
		
	}

}
