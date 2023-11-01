package com.con.observerV0;

public class Gif extends Observer {
	
	String gif;

	public Gif(String gif) {
		this.gif = gif;
	} 
	
	void showGif() {
		System.out.println("Gif: "+gif);
	}

	@Override
	void update() {
		showGif();
	}

}
