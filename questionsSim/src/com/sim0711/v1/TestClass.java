package com.sim0711.v1;

//What would be the result of attempting to compile and run the following code?
// Filename: TestClass.java

public class TestClass {
	public static void main(String args[]) {
		A c = new B();
		System.out.println(c.max(10, 20)); //80
	}
}

class A {
	          //20   40
	int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y; //40
	}
}

class B extends A {
	          //20    40
	int max(int x, int y) {
		return 2 * super.max(x, y);
		//return 2 * 40 = 80
	}
}

class C extends B {
	//          10     20
	int max(int x, int y) {
		return super.max(2 * x, 2 * y);
		//return 80
	}
}