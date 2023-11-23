package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		Estacion estacion = Estacion.INVIERNO;
		
		switch(estacion) {
		
		case VERANO:
			System.out.println(estacion.getVisitantesEsperados());
			break;
		case INVIERNO:
			System.out.println(Estacion.INVIERNO +"  "+estacion.getVisitantesEsperados());
			break;
		case OTONIO:
			System.out.println(estacion.getVisitantesEsperados());
			break;
		default:
			System.out.println(estacion.getVisitantesEsperados());
			break;
		}
	}

}
