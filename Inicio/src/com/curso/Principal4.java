package com.curso;

public class Principal4 {

	public static void main(String[] args) {
		
		int i = 10;
		String s = "Hello";
		StringBuilder sb = new StringBuilder("Hola");
		
		ajustar(i,s,sb);
		
		System.out.println(i); //10
		System.out.println(s); //Hello
		System.out.println(sb); //Hola Mundo

	}

	private static void ajustar(int i, String s, StringBuilder sb) {
		
		i = i + 5;
		s.concat("World");
		sb.append("Mundo");
		
//		System.out.println(i); //15
//		System.out.println(s); //Hello
//		System.out.println(sb); //Hola Mundo

		
	}

}
