package com.sim2610.v1;

public class ATest {
	String global = "111"; //Variable de Instancia de Clase

	static public int parse(String arg) {
		int value = 0;
		String global = arg; //Variable local
		try {
			value = Integer.parseInt(global); // <= Variable local. 333
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
		System.out.print(global  + " " + value + " ");
		return value;
	}

	public static void main(String[] args) {
		System.out.print(ATest.parse("333"));
	}
}