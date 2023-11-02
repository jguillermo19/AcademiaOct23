package com.sim0211.v0;

//What would be the result of attempting to compile and run the following program?  
class TestClass {
	
	static TestClass ref;
	String[] arguments;

	public static void main(String args[]) {
		ref = new TestClass(); //<===
		ref.func(args);
	}

	public void func(String[] args) {
		ref.arguments = args;
	}
	
//	Select 1 option
//
//	*The program will fail to compile, since the static method main is trying to call the non-static method func.
//	*The program will fail to compile, since the non-static method func cannot access the static member variable ref.
//	*The program will fail to compile, since the argument args passed to the static method main cannot be passed on to the non-static method func.
//	*The program will fail to compile, since method func is trying to assign to the non-static member variable 'arguments' through the static member variable ref.
//	*The program will compile and run successfully.
}