package com.curso.v4;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Inyectando por Setter");
		Becario b1 = new Becario("Patrobas",18);
		Inyector.inyectarComputadora(b1,'W');
		b1.prenderComputadora();
		
		Becario b2 = new Becario("Andronico",18);
		Inyector.inyectarComputadora(b2,'L');
		b2.prenderComputadora();
		
		Becario b3 = new Becario("Epeneto",18);
		Inyector.inyectarComputadora(b3,'M');
		b3.prenderComputadora();
	
	}

}
