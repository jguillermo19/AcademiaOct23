package com.sim2911.v0;

public class InitTest2 {

	
	public static void main(String[] args) {
		System.out.println(new InitTest2().a);
		System.out.println(b);
	}
	
	
	public InitTest2() {
		//a = "b";
		//b = "b";
	}
	
	int y;
	{
		a = "aa";
		System.out.println(y);
	}
	
	
	
	static int x;
	
	static{
		b = "bb";
		System.out.println(x);
	}
	
	
	
	final static String b;
	
	final String a;

	
	
}