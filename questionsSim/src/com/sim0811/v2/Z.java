package com.sim0811.v2;

class Z {

	public final static void m1() {
		System.out.println("A m1()");
	}

	public final static void m1(int i) {
		System.out.println("A m1(int)");
	}
	
	public final static void m1(String s) {
		System.out.println("A m1(String)");
	}
	
	public static void main(String[] args) {
		
		m1(10);
		m1("hello");
		
		Z z = new Z(); //NO TIENE SENTIDO
		z.m1();
		
	}
}

