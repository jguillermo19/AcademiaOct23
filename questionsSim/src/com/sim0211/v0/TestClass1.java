package com.sim0211.v0;

//What will be the output when the following program 
//is run?
public class TestClass1 {
	char c; //'nul

	public void m1() {
		char[] cA = { 'a', 'b' };
		m2(c, cA);
		System.out.println(((int) c) + "," + cA[1]);
	}

	public void m2(char c, char[] cZ) {
		c = 'b';
		//cA[1] = cA[0] = 'm';
		cZ = new char[]{'y','x','w'};
	}

	public static void main(String args[]) {
		new TestClass1().m1();
	}
}