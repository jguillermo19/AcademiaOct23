package com.con.observerV0;

public class Text extends Observer {
	
	String cadena;

	public Text(String cadena) {
		this.cadena = cadena;
	} 
	
	void showCadena() {
		System.out.println("Text: "+cadena);
	}

	@Override
	void update() {
		showCadena();
	}

}
