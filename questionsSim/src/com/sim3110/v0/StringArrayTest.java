package com.sim3110.v0;

public class StringArrayTest{    
	public static void main(String args[]){       
		String[][][] arr  =
			{  
				{{"a", "b" , "c"}, { "d", "e", null } }, //0 
				{{"x"}, null }, //1
			    {{"y"},{"y"},{"1","2","3"}}, //2
			    {{"z","p"},null ,{} } //3 
			}; 
		System.out.println(arr[3][2]);    
	} 
}
