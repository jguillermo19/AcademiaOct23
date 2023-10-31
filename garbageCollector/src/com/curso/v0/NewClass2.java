package com.curso.v0;

public class NewClass2 {
	
	private Object o; 

	void doSomething(Object s) {
		o = s;
	}

	public static void main(String args[]) {
		Object obj = new Object(); 		
		NewClass2 tc = new NewClass2(); 
		tc.doSomething(obj); 		
		obj = new Object(); 		
		obj = null; 
		tc.doSomething(obj);
	}
}
