package com.curso.calcV3;

public class Principal {
	
	public static void main(String[] args) {
		
		Operacion o1 = new Operacion(8,4);
		Operacion o2 = new Suma(8,4);
		Operacion o3 = new Resta(8,4);
		Operacion o4 = new Multi(8,4);
		
		//Operacion[] arrayOpe = new Operacion[]{o1,o2,o3,o4};
//		Operacion[] arrayOpe = new Operacion[4]; //SIZE FIJO
//		arrayOpe[0] = o1;
//		arrayOpe[1] = o2;
//		arrayOpe[2] = o3;
//		arrayOpe[3] = o4;
		Operacion[] arrayOpe = {o1,o2,o3,o4};
		
		aplicar(arrayOpe);
		
//		int x = 1;
//		int y = 2 + x++;
//		System.out.println(x);
		//System.out.println(y); 
	}

	private static void aplicar(Operacion[] arrayOpe) {
		int x=0,y=0;
		for (/*int x=0,y=0*/; x<arrayOpe.length; ) {
			System.out.println(arrayOpe[x]);
			x++;
			y--;
		}
		System.out.println(x);
		
		
	}

}
