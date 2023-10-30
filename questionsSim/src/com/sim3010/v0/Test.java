package com.sim3010.v0;

//What will the following class print ?  

class Test {
	public static void main(String[] args) {
		int k = 1;
		int[] a = { 1 };
		//              4 + 2  
		k += (k = 4) * (k + 2);
	    //k = 1 + 4  *  6; =25
		//System.out.println(k);
		
		a[0] += (a[0] = 4) * (a[0] + 2);
		System.out.println(k + " , " + a[0]);
	}
}
