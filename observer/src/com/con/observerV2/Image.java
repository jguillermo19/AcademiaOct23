package com.con.observerV2;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(img, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		return Objects.equals(img, other.img) && size == other.size;
	}

}
