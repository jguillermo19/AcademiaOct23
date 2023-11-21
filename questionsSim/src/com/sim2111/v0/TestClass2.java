package com.sim2111.v0;

import java.util.function.Function;

//What changes, when applied independent of each other, 
//will enable the following code to compile?

// Assume appropriate import statements

class TestClass2 {
	
	//double defaultrate = 0.10;
	
	public double process(double payment, int rate) {
		double defaultrate = 0.10; // 1 EFECTIVE FINAL

		if (rate > 10) {
			//defaultrate = rate; // 2
			
		}

		Function<Integer, Integer> f = 
				x -> x + (int) (x * defaultrate); // 3

		return defaultrate;
	}
}