package com.sim0711.v0;

//(Duplicate of 2.1370. Kept for backward compatibility only. Will be removed later. ) What will the following code print when compiled and run? 
class Baap {
	public int h = 4;

	public int getH() {
		System.out.println("Baap " + h);
		return h;
	}
}

public class Beta extends Baap {
	public int h = 44;

	@Override
	public int getH() {
		System.out.println("Beta " + h);
		return h;
	}

	public static void main(String[] args) {
		Baap b = new Beta();
		System.out.println(b.h + " " + b.getH());
		                   //4          //44 
		                        
			                 //Beta    44  
			                 //4       44
		
		Beta bb = (Beta)b;
		System.out.println(((Baap)bb).h + " " + ((Baap)bb).getH());
		                   //4            44
		
		                   //Beta 44
		                   //4   44
		
		
	}
}