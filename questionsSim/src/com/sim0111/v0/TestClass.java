package com.sim0111.v0;

//What will be the result of trying to compile and execute the following program?  
public class TestClass {
	public static void main(String args[]) {
		int i = 0;
		int[] iA = { 10, 20 };
		iA[i] = i = 30;
		//i = iA[i] = 30;
		//                       30            20           30
		System.out.println("" + iA[0] + " " + iA[1] + "  " + i);
	}
}

//A mi me sorprendio esta asignación