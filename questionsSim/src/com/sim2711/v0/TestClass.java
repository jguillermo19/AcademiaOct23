package com.sim2711.v0;

public class TestClass {
	public static void main(String[] args) {
		double x = 0xb10_01_01; //A10, B11, C12, D13,E14, F15
		//float x = 0b10_000;
		//float x = 0b20_000;
		//float x = 0b10_000;
		//long x = 0b10000;
		//long x = 10_000_000_00;
		//double d = 0b10_000D;
		System.out.println(x);
	}
}

//What can be inserted in the above code so that it will compile and run without any problem?

//
//double x = 0xb10_000;
// 
//float x = 0b10_000;
// 
//float x = 0b20_000;
// 
//float x = 0b10_000f;
// 
//long x = 0b10000L;
//
//double d = 0b10_000D;