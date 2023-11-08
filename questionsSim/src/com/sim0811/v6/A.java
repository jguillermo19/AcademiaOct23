package com.sim0811.v6;

//Consider the following classes:
class A {
	public int getCode() {
		return 2;
	}
	
	public static void main(String[] args) {
		A a = null;
		AA aa = null;
		//a = (AA)aa;
		//a = new AA();
		//aa = new A();  //NO SE PUEDE
		//aa = (AA)a;
		//aa = a;  //NO SE PUEDE 
		((AA)a).doStuff();
		
	}
}
class AA extends A {
	public void doStuff() {
	}
}








