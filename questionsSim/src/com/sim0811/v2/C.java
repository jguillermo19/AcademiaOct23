package com.sim0811.v2;

class C {

	private String m1() {
		System.out.println("A m1()");
		return null;
	}

	public void m1(int i) {
		System.out.println("A m1(int)");
	}
	
	public static void main(String[] args) {
		new C().m1();
		
		new C().m1(4);
	}

}

