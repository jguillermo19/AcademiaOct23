package com.curso.herenciaV4;


public class Principal2 {
	
	public static void main(String[] args) {
		
		Object a3 = new AguilaReal("AguilaReal");
		
		((AguilaReal)a3).volar(); //Override
		((AguilaReal)a3).volarAve(); //Hereda
		((AguilaReal)a3).volarAguila(); //Hereda
		((AguilaReal)a3).volarAguilaReal(); //Tiene
		
		 
	}

	
}
