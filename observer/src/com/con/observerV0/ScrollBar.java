package com.con.observerV0;

public class ScrollBar extends Observer {
	
	void desplazar() {
		System.out.println("Desplazar ScrollBar ");
	}

	@Override
	void update() {
		desplazar();
	}

}
