package com.sim0911.v3;

//What is wrong with the following code written in a single file named TestClass.java?

class SomeThrowable extends Throwable { }
class MyThrowable extends SomeThrowable { }

public class TestClass{
   public static void main(String args[]) throws SomeThrowable {
      try{
         m1();
      }catch(SomeThrowable e){
         throw e;
      }finally{
         System.out.println("Done");
      }
      System.out.println("Fin de Programa");
   }
   public static void m1() throws MyThrowable{
      throw new MyThrowable();
   }
}
