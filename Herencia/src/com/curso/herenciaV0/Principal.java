package com.curso.herenciaV0;

public class Principal {
	
	public static void main(String[] args) {
		
		Aguila ave1 = new Aguila("Aguila1");
		
		ave1.volarAguila();
		ave1.volarAve(); //hereda
		ave1.volar(); //hereda
		
	}

}
