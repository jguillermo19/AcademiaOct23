package com.con.observerV0;

public class Principal {

	public static void main(String[] args) {
		
		Text text = new Text("Java");
		Image img = new Image("Pato");
		ScrollBar sb = new ScrollBar();
		Gif gif = new Gif("Happy");

		Mouse mouse = new Mouse();
		
		mouse.click();
		
		System.out.println("***********");
		
		mouse.attach(text);
		mouse.attach(img);

		mouse.click();
		
		System.out.println("***********");
		
		mouse.detach(text);

		mouse.click();
		
		System.out.println("***********");
		
		mouse.attach(text);
		mouse.attach(gif);
		mouse.attach(sb);
		mouse.attach(gif);

		mouse.click();

		
	}

}
