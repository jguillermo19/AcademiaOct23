package com.curso.v8;

public class Principal {

	public static void main(String[] args)  {
		
		System.out.println("V8");
		try(Pato pato = new Pato("Donald");
			Pato pato2 = new Pato("Lucas")){
			pato.volar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
