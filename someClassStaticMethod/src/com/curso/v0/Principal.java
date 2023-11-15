package com.curso.v0;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Principal {

	public static void main(String[] args) {
		
		boolean resultado = false;

		BiPredicate<Integer,Integer> esMas10 =
				(x,y) -> x+y > 10;				
		resultado = esMas10.test(3,4);
		System.out.println(resultado);
		resultado = esMas10.test(9,4);
		System.out.println(resultado);
		
		System.out.println("**************");
		
		UnaryOperator<String> uoString = 
				z -> z.concat("!!");
		String res = uoString.apply("Java");
		System.out.println(res);
		
		System.out.println("**************");
		
		BiFunction<String,StringBuilder,Integer> bf =
				(x,y) -> x.length() + y.indexOf("a");
				         //5        +   1
				
		int i = bf.apply("Hello", new StringBuilder("Java"));
		
		System.out.println(i);
				
	}

}
