package com.curso.v1;

import java.util.*;
import java.util.function.*;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Method Reference NEW");
		//DEFINICION DE LAMBDA
		Supplier<Persona> supPer = Persona::new;
		//0 Objetos Persona
		Persona per1 = supPer.get();
		System.out.println(per1);
		
		System.out.println("**********");
		
		Function<Integer,Persona> funPer = Persona::new;
		Persona per2 = funPer.apply(5);
		System.out.println(per2);
		
		System.out.println("**********");
		
		BiFunction<Integer,String,Persona> biFunPer = Persona::new;
		Persona per3 = biFunPer.apply(9,"Patrobas");
		System.out.println(per3);
		
		System.out.println("**********");
		
		TriFunction<Integer,String,Double,Persona> triFunPer = Persona::new;
		Persona per4 = triFunPer.apply(5,"Epeneto",9.9);
		System.out.println(per4);
		
		System.out.println("**********");

		Supplier<List<Double>> supLista = ArrayList<Double>::new;
		List<Double> lista = supLista.get();
		System.out.println(lista);
		System.out.println("----------");		

		Function<String, Integer> fun = Integer::new;
		Integer i = fun.apply("8");
		System.out.println(i);
		
		System.out.println("----------");
		BiFunction<String,String, Locale> locBiFun = Locale::new;
		Locale loc = locBiFun.apply("en", "UK");
		System.out.println(loc);
		
	}

}
