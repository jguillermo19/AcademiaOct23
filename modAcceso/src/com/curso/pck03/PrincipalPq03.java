package com.curso.pck03;
import com.curso.pck01.Estudiante;

public class PrincipalPq03 extends Estudiante {
	
	public PrincipalPq03(String nombre, int edad) {
		super(nombre,edad);
	}
	
	public static void main(String[] args) {
	
		PrincipalPq03 est = 
				new PrincipalPq03("Patrobas",8);

		est.nombre = "Epeneto";
		est.edad = 16;
	}

}
