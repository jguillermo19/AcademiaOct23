package com.curso.v0;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	
	MyClass mc;
	
	//List<TestClass> ltc = new ArrayList<>();
	
	private class MyClass {
	}
	
	MyClass getMyClassObject() {
		MyClass mc = new MyClass(); // 1
		return mc; // 2
	}

	public static void main(String[] args) {
		TestClass tc = new TestClass(); // 3
		MyClass x = tc.getMyClassObject(); // 4
		System.out.println("got myclass object"); // 5
		x = new TestClass().new MyClass(); // 6
		System.out.println("done"); // 7
	}
}