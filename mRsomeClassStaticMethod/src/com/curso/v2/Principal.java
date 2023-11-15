package com.curso.v2;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Principal {

	public static void main(String[] args) {
		
		boolean resultado = false;

		BiPredicate<Integer,Integer> esMas10 = 
				Numeros::esMasDe10;
		resultado = esMas10.test(3,4);
		System.out.println(resultado);
		resultado = esMas10.test(9,4);
		System.out.println(resultado);	
		
		System.out.println("**************");
		
		UnaryOperator<String> uoString = 
				Util::hacerExcitante;
		String res = uoString.apply("C++");
		System.out.println(res);
		
		System.out.println("**************");

		uoString = Principal::hacerRico;
		System.out.println(uoString.apply("C++"));
		
		System.out.println("**************");
		
		BiFunction<String,StringBuilder,Integer> bf =
				Principal::metodoRaro;
				
		int i = bf.apply("Accenture", new StringBuilder("Mundo"));
		
		System.out.println(i);
				
	}

	private static String hacerRico(String t) {
		return t+"$$";
	}
				
	private static Integer metodoRaro(String s, StringBuilder sb) {
		return s.length() + sb.indexOf("a");
	}
	

}
