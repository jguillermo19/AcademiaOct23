package com.sim0112.v2;

public class Speak {
    public static void main(String[] args) {
    	//GoodSpeak s999 = new GoodSpeak();
    	
    	GoodSpeak s = new Patito();
    	
        ((Tone)s).up();
    }
}

class  GoodSpeak extends Speak {
    public void up(){
        System.out.println("PATITO UP UP UP");
    }
}

class Patito extends GoodSpeak implements Tone{
	
}

interface Tone{
    void up();
}