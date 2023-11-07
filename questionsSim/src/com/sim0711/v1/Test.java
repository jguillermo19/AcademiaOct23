package com.sim0711.v1;

class Super {
	String ID = "QBANK";
}

class Sub extends Super {
	{
		System.out.print("In Sub");
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println(new Sub().ID);
	}
}