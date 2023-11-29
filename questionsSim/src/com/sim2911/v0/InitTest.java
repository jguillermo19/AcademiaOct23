package com.sim2911.v0;

public class InitTest {

	static String s1 = sM1("a");
	String s2 = sM1("z");
	
	public static void main(String args[]) {
		InitTest it = new InitTest();
		InitTest it2 = new InitTest();
		
		//acb constructor
		//b constructor
	}

	private static String sM1(String s) {
		System.out.println(s);
		System.out.println(new InitTest().s2);
		return s;
	}
	
	InitTest(){
		System.out.println("Constructor");
	}
	
	{s1 = sM1("b");}
	
	static {
		s1 = sM1("c");
		//System.out.println(s2);
	}
}