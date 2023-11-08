package com.sim0811.v4;

public class Principal {

	public static void main(String[] args) {

		//System.out.println(Aguila.tipo);
		
		Ave ave = new Aguila();
		
		System.out.println(((Aguila)ave).tipo);
		//System.out.println(Aguila.tipo);
	}

}
