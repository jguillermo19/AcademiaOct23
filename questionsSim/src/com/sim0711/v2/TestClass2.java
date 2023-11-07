package com.sim0711.v2;

public class TestClass2 {
	// OVERLOADING
	static void flyIt(Number n) {
		System.out.println("Number");
	}

	// OVERLOADING
	static void flyIt(Integer i) {
		System.out.println("Integer");
	}

	// OVERLOADING
//	static void flyIt(Double d) {
//		System.out.println("Double");
//	}

	public static void main(String[] args) {
		
		System.out.println(null instanceof Object);
		
		
		Number n = new Integer(5);
		Integer i = new Integer(8);
		//Object o = new Integer(8);
		flyIt(n);

	}
}