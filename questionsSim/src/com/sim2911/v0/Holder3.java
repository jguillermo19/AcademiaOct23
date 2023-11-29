package com.sim2911.v0;

class Holder3 {
	int value;
	Holder3 link; //HAS A

	public Holder3(int val) {
		value = val;
	}

	public static void main(String[] args) {
		Holder3 a = new Holder3(100);
		a.link = a;
		
		System.out.println(a.link.value);
		
	}
}