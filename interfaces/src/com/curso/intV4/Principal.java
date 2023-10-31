package com.curso.intV4;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Lambdas");
		Operacion[] arrayOpe = {
				(x,y)->(int)(Math.pow(x, y)),
				(int w,int z)->{
					System.out.println("Division: "+w+" y "+z);
					return w/z;
				},
				(x,y)->{
					System.out.println("Suma: "+x+" y "+y);
					return x+y;
				},
				
				(pato1,pato2)->pato1-pato2,
				(ope1,ope2)->ope1*ope2,
				(t,v)->{
					//.....LO QUE SEA..........
					System.out.println("SIN SENTIDO");
					return 1000;
				}
		};

		aplicar(arrayOpe);
		
	}

	private static void aplicar(Operacion[] arrayOpe) {
		for(Operacion ope : arrayOpe) {
			//POLIMORFISMO
			int r = ope.ejecuta(8,4);
			System.out.println(r);
		}
	}

}
