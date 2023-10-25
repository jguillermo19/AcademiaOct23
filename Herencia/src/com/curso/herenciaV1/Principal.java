package com.curso.herenciaV1;

public class Principal {
	
	public static void main(String[] args) {
		
		Object cadena = new String("Java");
		System.out.println(((String)cadena).length());
		
		Ave ave1 = new Aguila("Aguila1");
		
		((Aguila)ave1).volarAguila();
		ave1.volarAve(); //hereda
		ave1.volar(); //hereda
		
	}

}
