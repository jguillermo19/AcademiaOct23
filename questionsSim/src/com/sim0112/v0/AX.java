package com.sim0112.v0;

//What will happen when the following code is compiled and run?

class AX {
	static int[] x = new int[0];
	
	static {
		x[0] = 10;
	}

	public static void main(String[] args) {
		AX ax = new AX();
	}
}