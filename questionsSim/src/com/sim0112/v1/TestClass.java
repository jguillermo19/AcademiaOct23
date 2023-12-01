package com.sim0112.v1;

class MyClass {
}

public class TestClass {
	
	MyClass mc;
	
	MyClass getMyClassObject() {
		mc = new MyClass(); // 1  => Garbage Collection
		return mc; // 2
	}

	public static void main(String[] args) {
		TestClass tc = new TestClass(); // 3
		
		MyClass x = tc.getMyClassObject(); 
		// 4 => Se crea el objeto linea 1
		
		System.out.println("got myclass object"); // 5
		x = new MyClass(); // 6
		// No elegible por el Garbage Collection
		System.out.println("done"); // 7
		
	}
}

//After what line the MyClass object created at line 1 
//will be eligible for garbage Collection?