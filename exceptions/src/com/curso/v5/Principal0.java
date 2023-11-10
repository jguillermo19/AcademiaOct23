package com.curso.v5;

public class Principal0 {

	public static void main(String[] args){
		System.out.println("V5");
		int x = 1001;
		int y = 2;
		int res = 0;
		
		try {
			res = calcularDiv(x,y);
		} catch (CeroException e) {
			e.printStackTrace();
		} catch (NegativoException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Paso por finally");
		}
		 
		System.out.println("Resultado: "+res);
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) 
			throws CeroException, NegativoException{
		if (y==0)
			throw new CeroException("No se puede dividir entre 0");
		if (y<0)
			throw new NegativoException("No se puede dividir entre negativos");
		if (x>1000)
			throw new IllegalArgumentException("X no puede ser mayor a 999");
		return x/y;
	}

}
