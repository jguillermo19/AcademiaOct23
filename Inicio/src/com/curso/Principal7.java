package com.curso;

public class Principal7 {

	public static void main(String[] args) {
		
		int i = 10;
		String s = "Hello";
		StringBuilder sb = new StringBuilder("Hola");
		Integer integer = 10; 
		
		s = ajustar(i,s,sb, integer);
		
		System.out.println(i); //10
		System.out.println(s); //HelloWorld
		System.out.println(sb); //Hola Mundo
		System.out.println(integer); //10


	}

	private static String ajustar(int i, String s, StringBuilder sb, Integer integer) {
		
		i = i + 5;
		String patito = s.concat("World");
		sb.append("Mundo");
		integer = integer + 5;
		
//		System.out.println(i); //15
//		System.out.println(s); //Hello
//		System.out.println(sb); //Hola Mundo
//		System.out.println(integer); //15

		return patito;

		
	}

}
