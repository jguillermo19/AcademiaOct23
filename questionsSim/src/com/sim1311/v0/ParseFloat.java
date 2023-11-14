package com.sim1311.v0;

//Following is a supposedly robust method to parse an input for a float :

class ParseFloat {
	
	public static void main(String[] args) {
		int i = 0xF;
		System.out.println(i);
		String s  = "0xF"; //15
		new ParseFloat().parseFloat(s);
	}

	public float parseFloat(String s) {
		float f = 0.0f;
		try {
			f = Float.valueOf(s).floatValue();
			return f;
		} catch (NumberFormatException nfe) {
			System.out.println("Invalid input " + s);
			f = Float.NaN;
			return f;
		} finally {
			System.out.println("finally");
		}
		//return f;
	}
	
	public float otroParseFloat(String s) {
		float f = 0.0f;
		
		//Unboxing
		f = Float.valueOf(s);
		
		return f;
	}
}

//Which of the following statements about the above method is/are true?
/*
 * If input is "0.1" then it will return 0.1 and print finally.
 * 
 * If input is "0x.1" then it will return Float.NaN and print Invalid input 0x.1
 * and finally
 * 
 * If input is "1" then it will return 1.0 and print finally.
 * 
 * If input is "0x1" then it will return 0.0 and print Invalid input 0x1 and
 * finally.
 * 
 * The code will not compile.
 */