package com.curso.v4;

public class Principal0 {

	public static void main(String[] args){
		int x = 8;
		int y = 0;
		int res = 0;
		
		try {
			res = calcularDiv(x,y);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("Resultado: "+res);
		
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) 
			               throws Exception {
		if (y==0)
			throw new CeroException("No se puede dividir entre 0");
		if (y<0)
			throw new NegativoException("No se puede dividir entre negativos");
		return x/y;
	}

}
