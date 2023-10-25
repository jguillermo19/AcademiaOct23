package com.sim2510.v2;

class A {

	int i = 4;

	A() {
		print(); //TRAMPA
	}
	
	void print() {
		System.out.print(i+" "); 
	}
}

class B extends A{
	
	public static void main(String[] args) {
		A a = new B(); //4
		a.print(); //4
	}
	
//	void print() {
//		System.out.println(i+"");
//		                                    
//	}
}