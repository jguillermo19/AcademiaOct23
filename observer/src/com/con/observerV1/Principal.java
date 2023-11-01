package com.con.observerV1;

public class Principal {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();

		Text text = new Text("Java",mouse);
		Image img = new Image("Pato",5, mouse);
		
		mouse.click();
		
		System.out.println("**********");
		
		ScrollBar sb = new ScrollBar(mouse);
		Gif gif = new Gif("Happy",mouse);
		
		mouse.click();
		
		System.out.println("**********");

		mouse.detach(img);
		
		mouse.click();

		
	}

}
