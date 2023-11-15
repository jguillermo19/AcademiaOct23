package com.curso.v1;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;
import java.util.function.BiFunction;

public class Principal {

	public static void main(String[] args) {
		
		boolean resultado = false;

		BiPredicate<Integer,Integer> esMas10 =
				(x,y) -> Numeros.esMasDe10(x, y);		
		resultado = esMas10.test(3,4);
		System.out.println(resultado);
		resultado = esMas10.test(9,4);
		System.out.println(resultado);
		
		System.out.println("**************");
		
		UnaryOperator<String> uoString = 
				z -> Util.hacerExcitante(z);
		String res = uoString.apply("Python");
		System.out.println(res);
		
		System.out.println("**************");

		uoString = t -> Principal.hacerRico(t);
		System.out.println(uoString.apply("Java"));
		
		System.out.println("**************");
				
		BiFunction<String,StringBuilder,Integer> bf =
				(x,y) -> Principal.metodoRaro(x,y);
				
		int i = bf.apply("Hola", new StringBuilder("Java"));
		
		System.out.println(i);
				
	}

	private static String hacerRico(String t) {
		return t+"$$";
	}
	
	private static Integer metodoRaro(String s, StringBuilder sb) {
		return s.length() + sb.indexOf("a");
	}

}
