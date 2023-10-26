package com.curso.herenciaV7;

public interface Ave {
	
	void volar();
	
	//2 Tipos de métodos con comportamiento //JAVA 8
	static void volarStatic() {
		System.out.println("Método static de Interface");
		//volarPrivate();
	}
	
	default void volarDefault() {
		System.out.println("Método default de Interface");
		volarPrivate();
	}
	
	//2 Tipos de métodos con comportamiento //JAVA 9
	private void volarPrivate() {
		System.out.println("Método Private de Inteface");
	}

	

}
