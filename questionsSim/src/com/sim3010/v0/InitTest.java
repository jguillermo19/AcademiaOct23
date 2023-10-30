package com.sim3010.v0;

//What will the following class print ?  
class InitTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		
		a += (a = 4);
		// a = a + a
		//    10 + 4
		
		//System.out.println(a); //14
		
		b = b + (b = 5);
   		         
		System.out.println(a + ",  " + b);
	}
}