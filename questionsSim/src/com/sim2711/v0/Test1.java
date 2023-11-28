package com.sim2711.v0;

//What will the following program print?
class Test1 {
	public static void main(String args[]) {
		int var = 20, i = 0;
		do {
			while (true) {
				if (i++ > var)
					break;
			}
			break;
		} while (i < var--);
		System.out.println("var: "+var);
		System.out.println(i);

	}
}

//var   -    i
// 20        0
//           1
//  .........
//           19
//           20
//           21
//           22
// 19
