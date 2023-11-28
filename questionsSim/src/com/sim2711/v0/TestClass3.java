package com.sim2711.v0;

import java.util.Arrays;

public class TestClass3 {
	static boolean b; //false
	static int[] ia;// = new int[1]; 
	static char ch; //0
	static boolean[] ba; // = new boolean[1]; 

	public static void main(String args[]) {
		
		System.out.println(Arrays.toString(ia));
		System.out.println(Arrays.toString(ba));
		
		boolean x = false;
		if (b) {
			//   0  == ia[0] 
			//   0  == 0
			x = (ch == ia[ch]);
			//x = true
		}
		 else 
			    //ba[0] = false
			x = (ba[ch] = b);
		    //x = false;
		
		    System.out.println(x + " " + ba[ch]);
	}
}