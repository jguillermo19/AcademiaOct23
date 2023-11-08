package com.sim0811.v2;

//What can be inserted at //1 and //2 in the code below so that it can compile 
//without errors:

class Doll {
	String name;

	Doll(String nm) {
		this.name = nm;
	}
}

class Barbie extends Doll {
	Barbie() {
		this("Algo");
		// 1
	}

	Barbie(String nm) {
		super(nm);
		// 2
	}
}

public class TestClass {
	public static void main(String[] args) {
		Barbie b = new Barbie("mydoll");
	}
}