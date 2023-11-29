package com.sim2811.v0;

import java.io.FileNotFoundException;

//Consider the following program: FileNotFoundException

class Game {
	public void play() throws Exception {
		System.out.println("Playing...");
	}
}

class Soccer extends Game {
	public void play(String ball)   {
		System.out.println("Playing Soccer with " + ball);
	}
}

public class TestClass2 {
	public static void main(String[] args) throws Exception{
		Game g = new Soccer();
		//g.play();
		//((Soccer)g).play("jugar");
		// 1
		Soccer s = (Soccer) g;
//		s.play();
		s.play("jugar");
		// 2
	}
}
//Which of the given options can be inserted at //1 and //2?
