package com.curso.herenciaV7;

public class Principal {
	
	public static void main(String[] args) {
		
		Ave.volarStatic();
				
		Ave a = new Aguila();
		
		a.volarDefault();
		
	}

}
