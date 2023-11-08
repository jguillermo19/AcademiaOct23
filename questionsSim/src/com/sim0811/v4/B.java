package com.sim0811.v4;

class A {
	A() {
		print(); //TRAMPA
	}

	void print() {
		System.out.print("A ");
	}
}

class B extends A {
	int i = 4;

	public static void main(String[] args) {
		A a = new B();
		a.print();
	}

	void print() { //EJECUTA
		System.out.print(i + " "); //0 4 
	}
}
