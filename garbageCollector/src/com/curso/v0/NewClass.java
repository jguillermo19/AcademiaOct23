package com.curso.v0;

public class NewClass {
	
	private Object o; //HAS-A

	void doSomething(Object s) {
		o = s;
	}

	public static void main(String args[]) {
		Object obj = new Object(); // 1 <=====
		
		System.out.println(obj.hashCode());
		
		NewClass tc = new NewClass(); // 2
		tc.doSomething(obj); // 3
		
		System.out.println(tc.o.hashCode());
		
		obj = new Object(); // 4
		
		System.out.println(obj.hashCode());
		
		obj = null; // 5
		
		tc.doSomething(obj); // 6 //tc.o = null;
		//tc = null;

		System.out.println(tc.o.hashCode());

//		System.out.println(obj);
//		System.out.println(tc.o);

		
	}
}

//Which is the earliest line in the following code after which the object created on line // 1 can be
//garbage collected, assuming no compiler optimizations are done?