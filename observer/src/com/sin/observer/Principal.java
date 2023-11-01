package com.sin.observer;

public class Principal {

	public static void main(String[] args) {
		
		Text text = new Text("Java");
		Image img = new Image("Pato");
		ScrollBar sb = new ScrollBar();
		Gif gif = new Gif("Happy");

		Mouse mouse = new Mouse();
		mouse.text = text;
		mouse.img = img;
		mouse.sb = sb;
		mouse.gif = gif;
		
		mouse.click();
		
		System.out.println("***********");
		
		mouse.click();

		
	}

}
