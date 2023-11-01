package com.con.observerV1;

public class Text extends Observer {
	
	String cadena;

	public Text(String cadena, Subject sb) {
		super(sb);
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
