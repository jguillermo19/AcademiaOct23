package com.sim2811.v0;

//What will the following code print?
public class TestClass {
	int x = 5;

	int getX() {
		return x;
	}

	public static void main(String args[]) throws Exception {
		TestClass tc = new TestClass();
		tc.looper();
		System.out.println(tc.x);
	}

	public void looper() {
		int x = 0;
		       //x = 5
		x = getX();
		while (x != 0) {
			for (int m = 10; m >= 0; m--) {
				x = m; //x=0 SALIO 
			}
		}
	}
}