package com.sim3110.v0;

//Given: 
public class FunWithArgs {

	public static void main(String[][] args) { //<== Aguas
		System.out.println(args[0][1]); //b 
	}

	public static void main(String[] args) {
		FunWithArgs fwa = new FunWithArgs(); //<== Aguas
		String[][] newargs = {args} ; //<== Aguas
		fwa.main(newargs);
	}
}

//The above
//program is
//compiled with
//the command line:
//javac FunWithArgs.java and
//then run with:
//java FunWithArgs a b c  
//What
//will be
//the output
//?
