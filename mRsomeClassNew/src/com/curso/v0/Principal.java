package com.curso.v0;

import java.util.function.*;

public class Principal {

	public static void main(String[] args) {

		//DEFINICION DE LAMBDA
		Supplier<Persona> supPer = () -> new Persona();
		//0 Objetos Persona
		Persona per1 = supPer.get();
		System.out.println(per1);
		
		System.out.println("**********");
		
		Function<Integer,Persona> funPer = i -> new Persona(i);
		Persona per2 = funPer.apply(5);
		System.out.println(per2);
		
		
		
	}

}
