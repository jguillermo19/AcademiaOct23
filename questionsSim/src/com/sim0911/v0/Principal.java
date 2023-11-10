package com.sim0911.v0;

public class Principal {
	static boolean resultado;
	public static void main(String[] args) {
		
		A o = new C();
		//resultado = (o instanceof B) && (!(o instanceof A));
		//resultado = !((o instanceof A) || (o instanceof B));
		resultado = (o instanceof B) && (!(o instanceof C));
		//System.out.println(resultado); //B=>true, C=>false 
		resultado = ! ( !(o instanceof B) || (o instanceof C));
		System.out.println(resultado); //B=>true, C=>false 
		
		
	}
}

class A {}
class B extends A {}
class C extends B {}

//Which of these boolean expressions correctly 
//identifies when an object 'o' actually refers to an 
//object of class B and not of C?
//You had to select 2 options

//(o instanceof B) && (!(o instanceof A)) 
//
//!((o instanceof A) || (o instanceof B)) 
//
//(o instanceof B) && (!(o instanceof C)) 
//
//! ( !(o instanceof B) || (o instanceof C)) 
//
//	(o instanceof B) && !((o instanceof A) || (o instanceof C))
