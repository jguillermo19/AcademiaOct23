package com.sim3010.v0;

class Test3 {

	public static void main(String[] args) {
		int a = 5;
	  
		//int resultado = ++a + a++ + a;
//		int resultado1 = a++;
//		System.out.println("res1:"+resultado1); //5
//		System.out.println("a:"+a); //6
//		
		//                7  +  5
		int resultado2 = ++a + a++;
		System.out.println("res1:"+resultado2); //12
		System.out.println("a:"+a); //7 
		
		short i1 = 11;
		
		//i1 = i1 + 3;
		
		i1 += 3;
		
		System.out.println(i1);
		

	}

}
