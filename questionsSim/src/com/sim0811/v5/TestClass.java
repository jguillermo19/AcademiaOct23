package com.sim0811.v5;

//Filename: TestClass.java
public class TestClass {
	public static void main(String args[]) {
		A b = new B("good bye");
	}
}

class A {
	A() {
		this("hello", " world");
	}

	A(String s) {
		System.out.println(s); //good bye world
	}
      //good bye   world
	A(String s1, String s2) {
		this(s1 + s2);
	}
}

class B extends A {
	B() {
		super("good bye");
	};
      //good bye
	B(String s) {
		super(s, " world");
		System.out.println(s); //good bye
	}

	B(String s1, String s2) {
		this(s1 + s2 + " ! ");
	}
}

//You had to select 1 option
//It will print "good bye".
//It will print "hello world".
//It will print "good bye world".
//It will print "good bye" followed by "hello world".
//It will print "hello world" followed by "good bye".