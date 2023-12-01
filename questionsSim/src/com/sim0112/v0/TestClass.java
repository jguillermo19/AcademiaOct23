package com.sim0112.v0;

//What will the following code print when run?
public class TestClass {
	
	public static Integer wiggler(Integer x) {
		Integer y = x + 10; //15
		x++; 
		System.out.println(x); //6
		return y; //15
	}

	public static void main(String[] args) {
		Integer dataWrapper = new Integer(5);
		Integer value = wiggler(dataWrapper);
		                   //5+15= 20            
		System.out.println(dataWrapper + value);
	}
}