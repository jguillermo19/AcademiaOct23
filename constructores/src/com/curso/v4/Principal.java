package com.curso.v4;

public class Principal {

	public static void main(String[] args) {

		Pato pato1 = new Pato();
		System.out.println(pato1);
		
		Pato pato2 = new Pato("Donald");
		System.out.println(pato2);
		
		Pato pato3 = new Pato("Lucas",10);
		System.out.println(pato3);

	}

}
