package com.sim0911.v0;

//How can you fix the following code to make it compile:

import java.io.*;

class Great {
	public void doStuff() throws FileNotFoundException {
	}
}

class Amazing extends Great {
	public void doStuff() throws IllegalArgumentException {
	}
}

public class TestClass {
	public static void main(String[] args) throws FileNotFoundException {
		Great g = new Amazing();

		g.doStuff();

	}
}
//Assume that changes suggested in a option are to be applied independent of other options.