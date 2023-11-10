package com.sim0911.v1;

//What is the result of compiling and running this code ?

class MyException extends Throwable {
}
class MyException1 extends MyException {
}
class MyException2 extends MyException {
}
class MyException3 extends MyException2 {
}

public class ExceptionTest {
  void myMethod() throws Throwable {
      throw new MyException3();
  }


  public static void main(String[] args) {
      ExceptionTest et = new ExceptionTest();
      try {
          et.myMethod();
    }catch (MyException3 me3) {
        System.out.println("MyException3 thrown");
    } catch (MyException me) {
          System.out.println("MyException thrown");
    }catch (Throwable me) {
              System.out.println("Throwable thrown"); 
    }finally {
          System.out.println(" Done");
      }
  }

}  
