package com.sim0112.v1;

//What can be inserted in the code below so that it will 
//print UP UP UP?

public class Speak {
    public static void main(String[] args) {
    	GoodSpeak s = new GoodSpeak();
        ((Tone)s).up();
    }
}
class GoodSpeak extends Speak {
    public void up(){
        System.out.println("UP UP UP");
    }
}
interface Tone{
    void up();
}