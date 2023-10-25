package com.sim2510.v4;

class A {
	public A() {
	}

	public A(int i) {
		System.out.println(i);
	}
}
////////////////////////// 1 4 5 2 3
class B extends A {
	//VARIABLE DE LA CLASE B
	static A s1 = new A(1);
	//VARIABLE DE INSTANCIA DE LA CLASE B
	A a = new A(2);

	public B(int i) {
		super(i);
	}

	public static void main(String[] args) {
		//VARIABLES LOCALES DE main
		B b = new B(5);
		
		A a = new A(3);
	}
	
	//VARIABLE DE LA CLASE B
	static A s2 = new A(4);
} 