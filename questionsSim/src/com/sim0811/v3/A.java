package com.sim0811.v3;

//Consider the following code:
class A {
	public Object m1(int a) {
		return a * 10 / 4 - 30;
	}
	
	public static void main(String[] args) {
		Object o = new A().m1(5);
		System.out.println(o.getClass().getName());
		System.out.println("***********");
		o = new A2().m1(5);
		System.out.println(o.getClass().getName());
	}
}

class A2 extends A {
	@Override
	public Object m1(int a) {
		return a * 10 / 4.0;
	}
}