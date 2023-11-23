package com.sim2211.v0;

import java.util.HashMap;
import java.util.Map;

public class Principal1 {

	public static void main(String[] args) {

		// What will the following code print?
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		
		map1.merge("b", 8, (i1, i2) -> i1 * i2);
		map1.merge("c", 3, (i1, i2) -> i1 + i2);
		
		map1.forEach((c,v)-> 
			System.out.println("Clave: "+c+". Valor: "+v));
	}

}
