package com.sim0911.v2;

//Which exact exception class will the following class throw when compiled and run?  
class Test {
  public static void main(String[] args) throws Exception {
      int[] a = null;
      int i = a[m1()];
  }

  public static int m1(){
      try {
    	  throw new Exception("Some Exception");
      }catch(Exception e) {
	   return 0;
  	  }
  }
}
