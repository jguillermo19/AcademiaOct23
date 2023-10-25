package com.curso.calcV4;

public class Principal {
	
	public static void main(String[] args) {
		
		Operacion o1 = new Operacion(8,4);
		Operacion o2 = new Suma(8,4);
		Operacion o3 = new Resta(8,4);
		Operacion o4 = new Multi(8,4);
		
		Operacion[] arrayOpe = {o1,o2,o3,o4};
		
		aplicar(arrayOpe);
		
	}

	private static void aplicar(Operacion[] arrayOpe) {
		
		for(Operacion ope : arrayOpe) {
			//POLIMORFISMO
			System.out.println(ope);
			System.out.println(ope.ejecuta());
		}
		
	}

}
