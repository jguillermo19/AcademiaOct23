package com.sim0811.v2;

//static methods are never overridden. They are hidden just like static or non-static fields. For example,
class A {
	static int i = 10;

	public static void m1() {
		System.out.println("A m1()");
	}

	public void m2() {
		System.out.println("A m2()");
	}
	
	public static void main(String[] args) {
		System.out.println();
		B b  = new B();
		System.out.println(b.i); //10
		b.m1();
		b.m2();
	}
}

class B extends A {
	//HIDDEN
	public static void m1() {
		System.out.println("B m1()");
	}

	public void m2() {
		System.out.println("B m2()");
	}

}

//Here, UNLIKE m2, m1() of B does not override m1() of A, it just hides m1() of A, as proven by the following code:
//A a  = new B();
//System.out.println(a.i)  //will print 10 instead of 20
//a.m1();  //will call A's m1
//a.m2();  //will call B's m2 as m2() is not static and so overrides A's m2()