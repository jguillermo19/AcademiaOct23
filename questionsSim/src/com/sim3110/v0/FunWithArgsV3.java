package com.sim3110.v0;

//Given: 
public class FunWithArgsV3 {

	private static void main(String[][] args) { 
		System.out.println(args[0][1]); 
	}

	public static void main(String[] args) {
		String[][] newargs = {args} ; 
		main(newargs);
	}
}
