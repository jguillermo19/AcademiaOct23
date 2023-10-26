package com.sim2610.v0;

import java.util.Arrays;

public class Principal {

	final static public  void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(args));
		System.out.println(args[args.length-1]);
	}
	
	final static public  void main(String[]... args) throws Exception {
		System.out.println("Hello WORLD 2");
	}

}
