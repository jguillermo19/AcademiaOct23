package com.curso.v0;

public class Principal2 {

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
		}catch(ArithmeticException e) {
			e.printStackTrace();
			//System.out.println("Se atrapo la exception ArithmeticException");
		}
		return 0;
		
	}

}
