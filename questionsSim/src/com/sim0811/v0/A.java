package com.sim0811.v0;

//static methods are never overridden. They are hidden just like static or non-static fields. For example,
class A {
	int i = 10;

	public static void m1() {
		System.out.println("A m1()");
	}

	public void m2() {
		System.out.println("A m2()");
	}
	
	public static void main(String[] args) {
		A a  = new B();
		System.out.println(a.i); //10
		a.m1();
		a.m2();
	}
}

class B extends A {
	int i = 20; //HIDDEN

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