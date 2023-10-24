package com.curso;

import java.util.Objects;

public class Pato {
	
	String nombre;

	public Pato(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		Pato other = (Pato) obj;
		return nombre.equals(other.nombre);
	}
	
	
	
}
