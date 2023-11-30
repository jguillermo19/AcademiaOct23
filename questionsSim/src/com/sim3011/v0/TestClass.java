package com.sim3011.v0;

//What will be the result of attempting to compile and run 
//the following program?
class TestClass{
   public static void main(String args[]){
      boolean b = false;
      int i = 1;
      do{
         i++ ; //2 => 3
         System.out.println("i: "+i);
      } while (b = !b); //b = true => false
      System.out.println( i ); 
   }
}