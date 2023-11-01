package com.con.observerV1;

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
