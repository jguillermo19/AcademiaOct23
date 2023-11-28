package com.sim2711.v0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Principal2 {

public static void main(String[] args) {
//Identify the valid for loop constructs assuming the following declarations:
		
		Object o = null;
		Collection c = new ArrayList<>(); //valid collection object.
		int[][] ia = new int[1][1]; //valid array

		int[][][] arrayTri = new int[1][1][1];

//		for(o : c){ }
//
		for(final Object o2 :c){
			//o2 = null;
		}
//
		for(int[][] i : arrayTri) { 
			
			for (int[] num : i) {
				
				for (int entero : num) {
					
				}
				
			}
			
		}
		 
//		for(Iterator it : c.iterator()){ }
		 
		for(int i : ia[0]){ }
}
}
