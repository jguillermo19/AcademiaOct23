package com.curso.v2;

public class Principal {
	
	public static void main(String[] args) {
		
		Becario b1 = new Becario("Patrobas",18);
		Inyector.inyectarComputadora(b1);
		b1.prenderComputadora();
		
		Becario b2 = new Becario("Andronico",18);
		Inyector.inyectarComputadora(b2);
		b2.prenderComputadora();
		
		Becario b3 = new Becario("Epeneto",18);
		Inyector.inyectarComputadora(b3);
		b3.prenderComputadora();
	
	}

}
