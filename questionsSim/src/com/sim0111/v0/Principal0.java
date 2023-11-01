package com.sim0111.v0;

public class Principal0 {
	//for
	//val = 10
	//x = 0
	//while
	//0 < 3          1<3             2<3
	//imprime 0 10   imprime 1 10    imprime 2 10
	//x = 1          x=2             x=3
	
	//for
		//val = 30
		//x = 0
		//while
		//0 < 3          1<3             2<3
		//imprime 0 30   imprime 1 30    imprime 2 30
		//x = 1          x=2             x=3
	
	//for
		//val = 50
		//x = 0
		//while
		//0 < 3          1<3             2<3
		//imprime 0 50   imprime 1 50    imprime 2 50
		//x = 1          x=2             x=3
		
	

	// Consider the following code:
	public static void main(String[] args) {
		int[] values = { 10, 30, 50 };
		int x = 0;
		for (int val : values) {
			
			System.out.println(val);
	                      //3		            
			while (x < values.length) {
				                  //2
				System.out.println(x + " " + val);
				x++;
			}
		}
	}
	// How many times is 2 printed out in the output?

}
