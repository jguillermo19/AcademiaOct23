package com.curso.v4;

public enum Estacion {
	
	PRIMAVERA("media"), //INTACIA DE LA CLASE ESTACION
	VERANO("alta"),
	INVIERNO("Baja"),
	OTONIO("Baja"); 
	
	private String visitantesEsperados;
	
	Estacion(String visitantesEsperados){
		this.visitantesEsperados = visitantesEsperados;
	}
	
	public String getVisitantesEsperados() {
		return visitantesEsperados;
	}

}
