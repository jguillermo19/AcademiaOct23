package com.java.basic;

public class Question01 {

	public static void main(String[] args) {

		byte starting = 3;
		short firstValue = 5;
		int secondValue = 7;
		                             //     1    +        2       +          1
		                             // 3    / 2 +      5     /2  +          5      / 3 
		int functionValue = (int) (starting / 2 + firstValue / 2 + (int) firstValue / 3) //4 
				+ secondValue / 2;
		System.out.println(functionValue); //7

	}

}
