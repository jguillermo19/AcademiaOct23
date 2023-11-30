package com.sim2911.v0;

//What will the following code print when compiled and run?
import java.util.*;
public class TestClass {
    public static void main(String[] args){
        List<Long>  al = new ArrayList<>(); //1
        al.add(111l); //2
        al.add(222l);
        System.out.println(al.get(al.size()-1));  //3
     }
    
    //AUTOBOXING primitivo=>Wrapper(Object)
    //              int   => Integer
    //             double => Double
    //   NO         int   => Integer => Double 
    //   NO         int   => Integer => Long
    //             long   => Long
}