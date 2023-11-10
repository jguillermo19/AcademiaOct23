package com.curso.v0;

public class Principal7 {

	public static void main(String[] args) {
		int x = 8;
		int y = -2;
		int res = 0;
		
		try {
			res = calcularDiv(x,y);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Paso por Finally");
		}
		System.out.println("Resultado: "+res);
		
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) {
		if (y<0)
			throw new IllegalArgumentException(
					"No se puede dividir entre Negativos");
		return x/y;
	}

}
