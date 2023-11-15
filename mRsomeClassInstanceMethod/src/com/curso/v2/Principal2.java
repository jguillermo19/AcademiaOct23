package com.curso.v2;

import java.util.function.*;

public class Principal2 {

	public static void main(String[] args) {

		System.out.println("Name Class - Method Instance");
		Principal2 prin = new Principal2();
		
//		BiFunction<Principal2,String,Integer> fun = 
//						(isnPrin,cadena) -> isnPrin.getCantLetras(cadena);
						
		BiFunction<Principal2,String,Integer> fun = Principal2::getCantLetras;		
		System.out.println(fun.apply(prin,"Xideral México"));
		
		TriPredicate<Principal2,Integer,Integer> bp = Principal2::esMayor10;
		System.out.println(bp.test(prin,8, 4));
				
		TriFunction<Principal2,Integer,Integer,Boolean> bf = Principal2::esMayor10;		
		System.out.println(bf.apply(prin,8, 8));
		
		
	}
	
	int getCantLetras(String s) {
		return s.length();
	}

	boolean esMayor10(int x, int y) {
		return (x+y) > 10;
	}
}

