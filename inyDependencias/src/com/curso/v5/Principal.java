package com.curso.v5;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Inyectando por Constructor");
		Becario b1 = Inyector.inyectarComputadora("Patrobas",18,'W');
		b1.prenderComputadora();
		
		Becario b2 = Inyector.inyectarComputadora("Andronico",18,'L');
		b2.prenderComputadora();
		
		Becario b3 = Inyector.inyectarComputadora("Epeneto",18,'M');
		b3.prenderComputadora();
	
	}

}
