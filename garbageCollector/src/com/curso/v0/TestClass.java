package com.curso.v0;



public class TestClass {
	
	public class MyClass {
	}
	
	MyClass getMyClassObject() {
		MyClass mc = new MyClass(); // 1
		return mc; // 2
	}

	public static void main(String[] args) {
		TestClass tc = new TestClass(); // 3
		MyClass x = tc.getMyClassObject(); // 4
		System.out.println("got myclass object"); // 5
		x = new MyClass(); // 6
		System.out.println("done"); // 7
	}
}