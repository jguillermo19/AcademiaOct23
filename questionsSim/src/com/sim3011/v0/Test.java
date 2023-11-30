package com.sim3011.v0;

//What will the following class print when 
//executed?

//& , |
//&& , ||

class Test{
    static boolean a;
    static boolean b;
    static boolean c;
    public static void main (String[] args){
    	//              a = true      b= false     c = false        
        boolean bool = (a = true) || (b = true) & (c = true);
        //System.out.println(bool);
        System.out.print(a + ", " + b + ", " + c);
    }
}