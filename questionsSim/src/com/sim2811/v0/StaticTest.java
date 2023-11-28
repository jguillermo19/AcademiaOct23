package com.sim2811.v0;

//Given:
class StaticTest{
    
    void m1(){
        StaticTest.m2();  // 1
        new StaticTest().m4();  // 2
        //StaticTest.m3();  // 3
    }
    
    static void m2(){ }  // 4
    
    void m3(){
        m1();            // 5
        m2();            // 6
        //StaticTest.m1(); // 7
    }
    
    static void m4(){ }
}
//Which of the lines will fail to compile?
