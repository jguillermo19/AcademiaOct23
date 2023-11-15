package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Mecanico instanciaMec = new Mecanico();
		Carro carro5 = new Carro();
		carro5.id = 5;
		carro5.color = "Black";
		
		instanciaMec.arreglar(carro5);
		
	}
}

class Carro {
	int id;
	String color;
}

class Mecanico {
	void arreglar(Carro c) {
		System.out.println("Arreglando carro id: " + c.id +", "+c.color);
	}
}