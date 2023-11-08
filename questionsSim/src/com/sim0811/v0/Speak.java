package com.sim0811.v0;
//What can be inserted in the code below so that 
//it will print UP UP UP?

public class Speak {
	public static void main(String[] args) {
        Speak s = new GoodSpeak();

        ((GoodSpeak)s).up();
        ((Tone)s).up();
        ((Tone)(GoodSpeak)(Speak)s).up();
        //s.up(); NO COMPILA
        
        ((Tone)s).up();
        //s.up();
        ((GoodSpeak)s).up();
        ((GoodSpeak)s).up();
        ((Tone)(GoodSpeak)s).up();

    }
	
}
class GoodSpeak extends Speak 
				implements Tone,Comparable {
	@Override
	public void up() {
		System.out.println("UP UP UP");
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
interface Tone {
	void up();
}