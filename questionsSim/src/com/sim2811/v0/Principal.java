package com.sim2811.v0;

public class Principal {

	public static void main(String[] args) {

		// Given:
		double daaa[][][] = new double[3][][];
		double d = 100.0;
		double[][] daa = new double[5][5];
		
		//daaa[0] = d;
		daaa[0] = daa;
		//daaa[0] = daa[0];
		daa[4][4] = d;
		System.out.println(daa[0][0]);
		daa = daaa[0];
		


		// Which of the following statements can be added to the above code, independent
		// of each other, without causing compilation or runtime errors?
	}

}
