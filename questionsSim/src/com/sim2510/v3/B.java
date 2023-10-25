package com.sim2510.v3;

class A {
	public A() {
	}

	public A(int i) {
		System.out.println(i);
	}
}
/////////////////// 1 4 2 3
class B {
	//VARIABLE DE LA CLASE B
	static A s1 = new A(1);
	//VARIABLE DE INSTANCIA DE LA CLASE B
	A a = new A(2);

	public static void main(String[] args) {
		//VARIABLES LOCALES DE main
		B b = new B();
		A a = new A(3);
	}
	
	//VARIABLE DE LA CLASE B
	static A s2 = new A(4);
} 