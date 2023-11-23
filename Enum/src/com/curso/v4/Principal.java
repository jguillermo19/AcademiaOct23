package com.curso.v4;

public class Principal {

	public static void main(String[] args) {

		for (Estacion estacion : Estacion.values() ) {
			System.out.println(estacion.name());
			System.out.println(estacion.ordinal());
		}
		
	}

}
