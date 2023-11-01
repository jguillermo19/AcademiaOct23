package com.sim0111.v0;

public class Test {

    public void test(Object obj) {
        System.out.println("test() Object method called");
    }
    
    public void test(Number n) {
        System.out.println("test() Number method called");
    }
    
//    public void test(Double d) {
//        System.out.println("test() Double method called");
//    }
    
    public void test(double d) {
      System.out.println("test() double method called");
    }
    
    public void test(Integer i) {
        System.out.println("test() Integer method called");
    }
    
//    public void test(String s) {
//        System.out.println("test() String method called");
//    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test(null);
    }
}