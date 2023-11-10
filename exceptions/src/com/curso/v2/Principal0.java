package com.curso.v2;

public class Principal0 {

	public static void main(String[] args) throws CeroException {
		int x = 8;
		int y = 0;
		int res = 0;
		
		res = calcularDiv(x,y);
		
		System.out.println("Resultado: "+res);
		
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) throws CeroException{
		if (y==0)
			throw new CeroException("No se puede dividir entre 0");
		return x/y;
	}

}
