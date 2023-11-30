package com.sim2911.v0;

class A {
}

class B extends A {
}

class C extends B {

}

class X {
	B getB() {
		return new B();
	}
}

class Y extends X {

	
	// public C getB(){ return new C(); } //COVARIANZA
	// protected B getB(){ return new C(); }
	
//	@Override
//	C getB() {
//		return new C();
//	}

	//A getB(){ return new A(); }

}
