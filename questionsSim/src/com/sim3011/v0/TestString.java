package com.sim3011.v0;

public class TestString {

	public static void main(String[] args) {
		
		//String s1 = "String".replace('g', 'G');
		//System.out.println(s1);
		
		boolean r = 
				"String".replace('g', 'G') == 
				"String".replace('g', 'G') ;
		
		r = "String".replace('g', 'g') == "String";
		
		r = "String".replace('g', 'g') == "String".replace('g', 'g');
		
		System.out.println(r); //true

	}

}
