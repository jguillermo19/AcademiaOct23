package com.curso.v1;

import java.util.function.BiConsumer;

public class Principal {

	public static void main(String[] args) {

		Mecanico instanciaMec = new Mecanico();
		Carro carro5 = new Carro();
		carro5.id = 5;
		carro5.color = "Yellow";
		
		BiConsumer<Mecanico,Carro> biCons = 
				(objMec, car)-> objMec.arreglar(car);
		
		biCons.accept(instanciaMec, carro5);
		
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