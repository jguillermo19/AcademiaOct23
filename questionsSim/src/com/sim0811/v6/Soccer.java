package com.sim0811.v6;

//What will the following program print when compiled 
//and run?

class Game {
	public void play() throws Exception {
		System.out.println("Playing...");
	}
}

public class Soccer extends Game {
	@Override
	public void play() {
		System.out.println("Playing Soccer...");
	}

	public static void main(String[] args) {
		Game g = new Soccer();
		try {
			g.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}