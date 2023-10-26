package com.sim2610.v0;

public class ATest {
	String global = "111"; //Variable de Instancia de Clase

	public int parse(String arg) {
		int value = 0;
		String global = arg; //Variable local
		try {
			value = Integer.parseInt(global); // <= Variable local. 333
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
		System.out.print(this.global  + " " + value + " ");
		return value;
	}

	public static void main(String[] args) {
		ATest ct = new ATest();
		System.out.print(ct.parse("333")); //111 333 333
	}
}