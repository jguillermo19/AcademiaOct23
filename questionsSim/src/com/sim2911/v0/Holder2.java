package com.sim2911.v0;

//What will the following class print when 
//compiled and run?
class Holder2 {
	int value = 1;
	Holder2 link; //HAS-A

	public Holder2(int val) {
		this.value = val;
	}

	public static void main(String[] args) {
		final Holder2 a = new Holder2(5);
		Holder2 b = new Holder2(10);
		a.link = b;
		b.link = setIt(a, b);
		System.out.println(b.link.value);
		//System.out.println(a.link.value);
	}

	public static Holder2 setIt(final Holder2 x, final Holder2 y) {
		//x.link = y.link;
		x.link = null;
		return x;
	}

}