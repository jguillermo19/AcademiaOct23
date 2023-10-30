package com.sim3010.v0;

class Test2 {
	
	public static void main(String[] args) {
		int k = 1;
		k += (k = 4) * (k + 2);
		System.out.println(k);
	}
	
}
