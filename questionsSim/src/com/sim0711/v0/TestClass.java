package com.sim0711.v0;

//Given the following program, which statements are true?  // Filename: TestClass.java 
public class TestClass {
	public static void main(String args[]) {
		A[] a, a1;
		B[] b;
		a = new A[10];
		a1 = a;
		b = new B[20];
		
		//b = a; //NO SE PUEDE, ERROR COMPILE
		//b = (B[]) a; //NO SE PUEDE, ERROR RUNTIME
				
		a = b; // 1
		
		b = (B[]) a; // 2 //QUEDA IGUAL
		b = (B[]) a1; // 3 ClassCastException
	}
}

class A {
}

class B extends A {
}
