package com.sim1411.v0;

//What will be the result of attempting to compile and run the following program?  
public class TestClass{
    public static void main(String args[ ] ){
       StringBuilder sb = new StringBuilder("12345678");
       //sb.setLength(2);
       sb.setLength(5);
       sb = new StringBuilder("1234567890");
       System.out.println(sb.length());
       System.out.println(sb);
    } }

//You had to select 1 option
// * It will print 5.
//* It will print 10.
//* It will print 8.
//* Compilation error.
//* None of the above.