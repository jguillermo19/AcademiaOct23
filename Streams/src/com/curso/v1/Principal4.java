package com.curso.v1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal4 {

	public static void main(String[] args) {
		
		//Stream<Integer> streamInt;

		IntStream resulRango = IntStream.rangeClosed(5,20);
		//5,6,7......17,18,19,20

        int r = resulRango.reduce(0,(a,b)->a+b);
        System.out.println("\n" + r);
	}

}
