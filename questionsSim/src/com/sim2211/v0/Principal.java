package com.sim2211.v0;

import java.util.*;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		List<String> ls = 
				               //  >8                       >8           >8      
				Arrays.asList("Tom Cruise", "Tom Hart", "Tom Hanks", "Tom Brady");
		
		Predicate<String> p = str -> { 
			//................
			System.out.println("Looking...");
			return str.indexOf("Tom") > -1;
		};
		
//		Predicate<String> p = str -> {
//			System.out.println("Looking...");
//			return str.indexOf("Tom") > -1;
//		};
		
		boolean flag = ls.stream()
						.filter(str -> str.length() > 8) //3 String
						.allMatch(p); //TERMINAL
		
		System.out.println(flag);
		
		//Looking  Looking Looking false
	}

}
