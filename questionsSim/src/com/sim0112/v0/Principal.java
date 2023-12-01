package com.sim0112.v0;

interface I {
}

class A implements I {
}

class B extends A {
}

class C extends B {
}

public class Principal {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		//papa = papa o hijo
		
		I name1 = new C();
		//C name2 = new B();
		
		
		//a = (B)(I)b; // a = b;
		
		//b = (B)(C)(Object)(B)(I)a;
		
		//a = (I)b;
		
		I i = (I)a;
		
		System.out.println(i);
	}

}
