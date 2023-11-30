package com.sim2911.v0;

//Consider the following class...

class Test{
   public static void main(String[ ] args){
      int[] a = { 1, 2, 3, 4 };
      int[] b = { 2, 3, 1, 0 };
      // (a = b) :  a = { 2, 3, 1, 0 };
      // a[0] = 1
      System.out.println( a [ (a = b)[3] ] );
                        //a={ 1, 2, 3, 4 };
      
      
      
   }
}

//What will it print when compiled and run ?