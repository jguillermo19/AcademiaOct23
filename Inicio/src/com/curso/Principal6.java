package com.curso;

public class Principal6 {

	public static void main(String[] args) {
		
		int i = 10;
		
		String s = "Hello";
		//s = null;
		StringBuilder sb = new StringBuilder("Hola");
		Integer integer = 10; //AUTOBOXING
		
		ajustar(i,s,sb, integer);
		
		System.out.println(i); //10
		System.out.println(s); //Hello
		System.out.println(sb); //Hola Mundo
		System.out.println(integer); //10


	}

	private static void ajustar(int i, String s, StringBuilder sb, Integer integer) {
		
		i = i + 5;
		s.concat("World");
		sb.append("Mundo");
		integer = integer + 5;
		
		System.out.println(i); //15
		System.out.println(s); //Hello
		System.out.println(sb); //Hola Mundo
		System.out.println(integer); //15


		
	}

}
