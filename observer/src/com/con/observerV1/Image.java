package com.con.observerV1;

public class Image extends Observer {
	
	String img;
	int size;

	public Image(String img, int size, Subject sb) {
		super(sb);
		this.img = img;
		this.size = size;
	} 
	
	void showImagen() {
		System.out.println("Imagen: "+img);
	}

	@Override
	void update() {
		showImagen();
	}

}
