package com.con.observerV0;

public class Image extends Observer {
	
	String img;

	public Image(String img) {
		this.img = img;
	} 
	
	void showImagen() {
		System.out.println("Imagen: "+img);
	}

	@Override
	void update() {
		showImagen();
	}

}
