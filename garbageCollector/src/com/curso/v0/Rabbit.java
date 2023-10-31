package com.curso.v0;

public class Rabbit {
	public static void main(String[] args) {
		Rabbit one = new Rabbit();
		Rabbit two = new Rabbit();
		Rabbit three = one;
		one = null; 
		Rabbit four = one; //two & three
		three = null; //GC => ELIMINA Rabbit LINEA 5
		two = null; //GC => ELIMINA Rabbit LINEA 6
		two = new Rabbit();
		System.gc();
	}
}