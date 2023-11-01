package com.con.observerV2;

public class ScrollBar extends Observer {
	
	ScrollBar(Subject sb){
		super(sb);
	}
	
	void desplazar() {
		System.out.println("Desplazar ScrollBar ");
	}

	@Override
	void update() {
		desplazar();
	}

}
