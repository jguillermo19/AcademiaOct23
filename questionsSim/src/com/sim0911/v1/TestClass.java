package com.sim0911.v1;

//What is wrong with the following code?

class MyException extends Exception {}

public class TestClass{
   public static void main(String[] args){
      TestClass tc = new TestClass();
      try{
         tc.m1();
      }
      catch (MyException e){
         try {
			tc.m1();
		} catch (MyException e1) {
			try {
				tc.m1();
			} catch (MyException e2) {
				e2.printStackTrace();
			}
		}
      }
      finally{
         tc.m2();
      }
   }
   public void m1() throws MyException{
      throw new MyException();
   }
   public void m2() throws RuntimeException{
      throw new NullPointerException();
   }
}
