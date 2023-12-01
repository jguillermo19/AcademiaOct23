package com.sim0112.v0;

//What can be inserted in the code below so that it will 
//print UP UP UP?

public class Speak {
    public static void main(String[] args) {
        Speak s = new GoodSpeak();

        ((GoodSpeak)s).up();

        ((Tone)s).up();
        
        ((GoodSpeak)(Object)(Speak)s).up();
    }
}
class GoodSpeak extends Speak implements Tone{
	@Override
    public void up(){
        System.out.println("UP UP UP");
    }
}
interface Tone{
    void up();
}