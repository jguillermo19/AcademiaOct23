package com.sim3110.v0;

//Given: 
public class FunWithArgsV2 {

	public static void main(String[][] args) { //<== Aguas
		System.out.println(args[0][1]); 
	}

	public static void main(String[] args) {
		FunWithArgsV2 fwa = new FunWithArgsV2(); //<== Aguas
		String[][] newargs = {args} ; //<== Aguas
		//String[][] newargs = {{"a","b","c"}}; 
		//String[][] newargs = {{"a","b","c"},{"d","e"},{"f"}};
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
