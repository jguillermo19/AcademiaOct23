package com.sim2510.v0;

class A {
	A() {
		print(); //1TRAMPA  <====
	}
	
	void print() {
		System.out.println("A ");
	}
}

class B extends A{
	int i = 4;

	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
	
	void print() {
		System.out.println(i+""); //2TRAMPA //0
		                                    //4
	}
}