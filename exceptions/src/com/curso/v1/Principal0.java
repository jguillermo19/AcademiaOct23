package com.curso.v1;

public class Principal0 {

	public static void main(String[] args) {
		int x = 8;
		int y = 0;
		int res = 0;
		
		try {
			res = calcularDiv(x,y);
		} catch (CeroException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resultado: "+res);
		
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) throws CeroException{
		if (y==0)
			throw new CeroException("No se puede dividir entre 0");
		return x/y;
	}

}
