package com.sim0811.v1;

//Which of the given statements are correct about the following
// code ? Filename : TestClass.java 
class TestClass {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println(b instanceof A);
	};
}

class A implements T1, T2 {
}

class B extends A implements T1 {
}

interface T1 {
}

interface T2 {
}

//(a instanceof T1) will return true.
//(a instanceof T2) will return true.
//(b instanceof T1) will return true.
//(b instanceof T2) will return true.

//(b instanceof A) will return false.