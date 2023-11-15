package com.curso.v1;

import java.util.function.*;

public class Principal2 {

	public static void main(String[] args) {

		Principal2 prin = new Principal2();
		
		Function<String,Integer> fun = s -> prin.getCantLetras(s);
		System.out.println(fun.apply("Xideral"));
		
		BiPredicate<Integer,Integer> bp = 
				(i1,i2) -> prin.esMayor10(i1,i2);
		System.out.println(bp.test(4, 4));
				
//		BiFunction<Integer,Integer,Boolean> bf =
//				(i1,i2) -> prin.esMayor10(i1,i2);		
//		System.out.println(bf.apply(4, 8));
		
		
	}
	
	int getCantLetras(String s) {
		return s.length();
	}

	boolean esMayor10(int x, int y) {
		return (x+y) > 10;
	}
}

