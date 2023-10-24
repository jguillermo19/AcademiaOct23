package com.curso;


public class Principal5 {
	
	public static void main(String[] args) {
		
		//Buffer de Integers
		//-128 al 127
		
		Integer i1 = 100;
		Integer i2 = 100;
		
		System.out.println(i1 == i2); //true
		
		Integer i3 = 200;
		Integer i4 = 200;
		
		System.out.println(i3 == i4); //false
		
		Integer i5 = new Integer(100);
		Integer i6 = new Integer(100);
		
		System.out.println(i5 == i6); //false
		
		Integer i7 = Integer.valueOf(100);
		Integer i8 = Integer.valueOf(100);
		
		System.out.println(i7 == i8); //true

		
		
	}
	
	
	
}
