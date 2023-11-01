package com.sin.observer;

public class Mouse {

	//ALTO ACOPLAMIENTO (BAJA COHESION)
	Text text;
	Image img;
	ScrollBar sb;
	Gif gif;
	
	void click(){
		text.showCadena();
		img.showImagen();
		sb.desplazar();
		gif.showGif();
	}
	
	
}
