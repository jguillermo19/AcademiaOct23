package com.sim3011.v0;

//Which of the given lines can be inserted at //1 of the following program ?  
public class TestClass1 {
	public static void main(String[] args) {
		short s = 9;
		Double i = 9d; 
		                    //unboxing
		System.out.println(s == i); //compara valor
	}
}
//You had to select 2 options 
// NO Short k = new Short(9); System.out.println(k instanceof Short);
// NO System.out.println(s instanceof Short);
// NO Short k = 9; System.out.println( k instanceof s);
// SI int i = 9; System.out.println(s == i);
// NO Boolean b = s instanceof Number;
// NO Short k = 9; Integer i = 9; System.out.println(k == i);
//Integer i = 9; System.out.println( s == i );