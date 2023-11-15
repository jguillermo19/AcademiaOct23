package com.curso.v2;

import java.util.function.*;

public class Principal2 {

	public static void main(String[] args) {

		System.out.println("Object - Method Instance");
		Principal2 prin = new Principal2();
		
		Function<String,Integer> fun = prin::getCantLetras;
		System.out.println(fun.apply("Xideral"));
		
		BiPredicate<Integer,Integer> bp = prin::esMayor10;
		System.out.println(bp.test(4, 4));
				
		BiFunction<Integer,Integer,Boolean> bf = prin::esMayor10;		
		System.out.println(bf.apply(8, 8));
		
		
	}
	
	int getCantLetras(String s) {
		return s.length();
	}

	boolean esMayor10(int x, int y) {
		return (x+y) > 10;
	}
}

