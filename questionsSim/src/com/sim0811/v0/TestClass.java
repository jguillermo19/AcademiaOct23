package com.sim0811.v0;

interface Flyer{ }
class Bird implements Flyer { }
class Eagle extends Bird { }
class Bat {}
//final class Bat extends Eagle implements Flyer { }

public class TestClass {

  public static void main(String[] args) {
      Flyer f = new Eagle();
      Eagle e = new Eagle();
      Bat b = new Bat();

      if(f instanceof Flyer) System.out.println("f is a Flyer");
      if(e instanceof Bird) System.out.println("e is a Bird");
      if(b instanceof Flyer) System.out.println("b is a Flyer");
      if(b instanceof Comparable) System.out.println("b is a Comparable");
      //if(b instanceof Bird) System.out.println("b is a Bird");

  }
}
//  What will be printed when the above code is compiled and run?
