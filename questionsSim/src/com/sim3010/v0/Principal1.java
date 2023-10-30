package com.sim3010.v0;

public class Principal1 {

	public static void main(String[] args) {
		//What is the result of executing the following fragment of code:

			boolean b1 = false;
			boolean b2 = false;
			
			//System.out.println(b2 != b1);
			
			//!   //1
			//!=  //2
			//=   //3
			
			//if (false = true)
			
			//             !b2 = true
			//    false 
			//    false  = true
			if (b2 != ( b1 = !b2)){
			   System.out.println("true");
			}
			else{
			   System.out.println("false");
			}
	}
}
