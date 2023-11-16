package com.sim1611.v0;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class TestClass {
	                           //( b -> 20 - b )
	public static int operate(IntUnaryOperator iuo) {
		return iuo.applyAsInt(5); // Ejecutar la lambda 
		       //5 -> 20 - 5 
		       //15
	}

	public static void main(String[] args) {
		
//	IntFunction<String> ifs = a -> new String("Dato:"+a);
//	System.out.println(ifs.apply(8));
		
	IntFunction<IntUnaryOperator> fo = a->b->a-b ;  //1
	
	//IntUnaryOperator iuoTemp = fo.apply(20); 
	//               iuoTemp = b -> 20 - b
		
	             //( b -> 20 - b ) //Funciones de orden superior
    int x = operate(fo.apply(20)); //2
    System.out.println(x);
	}
}

//What will the following code print when compiled and run?
