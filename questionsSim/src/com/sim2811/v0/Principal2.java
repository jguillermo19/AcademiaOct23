package com.sim2811.v0;

public class Principal2 {

	public static void main(String[] args) {
		// int r = new Principal2().factorial(Integer.MAX_VALUE);
		// System.out.println(r);
		//new Principal2().printMe(null);
		//new Principal2().m2();
		
		//Object[] oa = new Object[8];
		Object[] oa = null;
		System.out.println(oa.length);
		
	}

	int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	void printMe(Object[] oa) { //oa = null;
		for (int i = 0; i <= oa.length; i++)
			System.out.println(oa[i]);
	}

	Object m1() {
		return new Object();
	}

	void m2() {
		String s = (String) m1();
	}
	// Assume that method m2 is invoked.

}
