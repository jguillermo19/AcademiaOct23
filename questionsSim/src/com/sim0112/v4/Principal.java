package com.sim0112.v4;

class A {
	public int getCode() {
		return 2;
	}
}

class AA extends A {
	public void doStuff() {
	}
}
//Given the following two declarations, which of the 
//options will compile?

public class Principal {

	public static void main(String[] args) {
		A a = null;
		AA aa = null;
		
		((AA)a).doStuff(); 
		
	    //a = (AA)aa;
	    //a = new AA();
	    
		//aa = new A();
		//aa = (AA)a;
		
		//aa = a;
		
		System.out.println(aa);
		
		/*
		 *a = (AA) aa;
		a = new AA();
		aa = new A();
		aa = (AA) a;
		aa = a;
		((AA) a).doStuff(); 
		 * 
		 * 
		 */
	}

}
