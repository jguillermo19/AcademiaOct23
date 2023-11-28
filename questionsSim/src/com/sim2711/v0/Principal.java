package com.sim2711.v0;

public class Principal {

	public static void main(String[] args) {
		float f = new Principal().parseFloat("a.a");
		System.out.println(f); 
	}
	
	public float parseFloat(String s) {
	    float f = 0.0f;
	    try {
	        f = Float.valueOf(s).floatValue();
	        System.out.println("***:"+f);
	        return f;
	    } catch (NumberFormatException nfe) {
	        f = Float.NaN;
	        System.out.println("***:"+f);
	        return f;
	    } finally {
	        f = 10.0f;
	        return f;
	    }
	}

	//What will it return if the method is called with the input "0.0" ?

}
