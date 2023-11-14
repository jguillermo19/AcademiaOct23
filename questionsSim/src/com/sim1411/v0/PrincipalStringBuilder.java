package com.sim1411.v0;

public class PrincipalStringBuilder {

	public static void main(String[] args) {
		// Given:
		StringBuilder b1 = new StringBuilder("snorkler");
		StringBuilder b2 = new StringBuilder("yoodler");
		// Write the contents of b1 and b2 after the 
		// statements shown on the left are
		// executed independent of each other.
		//b1.append(b2.substring(2, 5).toUpperCase());
		//        (ODL)
		//b1 = "snorklerODL"
		
		//b2.insert(3, b1.append("a"));
		//b1 = snorklera
		//b2 = yoo snorklera dler
		
		b1.replace(3, 4, b2.substring(4))
		                   .append(b2.append(false));
		
		//b1 = "sno ler kler yoodlerfalse"
		//b2 = yoodlerfalse
		System.out.println(b1);
		System.out.println(b2);
		
		String cadena = "hola".substring(2);
		System.out.println(cadena); //la
	
	}

}
