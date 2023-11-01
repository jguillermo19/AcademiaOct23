package com.sim0111.v0;

public class Principal1 {
	

	// Consider the following code:
	public static void main(String[] args) {
		int[] values = { 2, 30, 50 };
		int x = 0;
		for (int val : values) {
			
			System.out.println(val);
	                      //3		            
			do {
				                  //2
				System.out.println(x + " " + val);
				x++;
			}while (x < values.length);
		}
	}
	// How many times is 2  printed out in the output?

}
