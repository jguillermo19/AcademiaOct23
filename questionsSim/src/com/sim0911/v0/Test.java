package com.sim0911.v0;

//What will the following code print when run?
public class Test {
  static String s = "";

  public static void m0(int a, int b) {
      s += a; //s = 1
      m2();
      m1(b);
  }

  public static void m1(int i) {
      s += i;
  }

  public static void m2() {
      throw new NullPointerException("aa");
  }

  public static void m() {
      m0(1, 2);
      m1(3);
  }

  public static void main(String args[]) {
      try {
          m();
      } catch (Exception e) {
      }
      System.out.println(s); //1
  }
}