package com.sim2811.v0;

class Test {
	public static void main(String[] args) throws Exception {
		int[] a = null;
		int i = a[m1()];
	}

	public static int m1() throws Exception {
		if (false)
			throw new Exception("Some Exception");
		return 8;
	}
}
