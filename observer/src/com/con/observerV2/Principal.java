package com.con.observerV2;

public class Principal {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		new Text("Java",mouse);
		Image i = new Image("Pato",5, mouse);
		
		mouse.click();
		System.out.println("**********");
		
		new ScrollBar(mouse);
		new Gif("Happy",mouse);
		
		mouse.click();
		System.out.println("**********");

		mouse.detach(i);
		
		mouse.click();

		
	}

}
