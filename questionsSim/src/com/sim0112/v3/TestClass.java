package com.sim0112.v3;

//What will the following program print when run?
public class TestClass {
	public static void main(String args[]) {
		A b = new B("good bye");
	}
}

class A {
	A() {
		this("hello", " world");
	}

	A(String s) {//<==
		System.out.println(s); //good bye world
		System.out.println("PASO1");
	}

	//good bye , world
	A(String s1, String s2) {
		this(s1 + s2);
		System.out.println("PASO2");
	}
}

class B extends A {
	B() {
		super("good bye");
	};

	B(String s) { //<==
		//good bye
		super(s, " world");
		System.out.println("PASO3");

	}

	B(String s1, String s2) {
		this(s1 + s2 + " ! ");
	}
}