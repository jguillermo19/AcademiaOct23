package com.con.observerV2;

public class Gif extends Observer {
	
	String gif;

	public Gif(String gif, Subject sb) {
		super(sb);
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
