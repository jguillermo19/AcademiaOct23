package com.curso.v0;

public class Principal3 {

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
			System.out.println("No se puede dividir entre 0");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Contacte al Administrador");
			e.printStackTrace();
		}
		return 0;
		
	}

}
