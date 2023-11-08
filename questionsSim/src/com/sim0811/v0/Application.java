package com.sim0811.v0;

//What will be the output of the following program ?
class CorbaComponent {
	String ior; //"URL://IOR"

	CorbaComponent() {
		startUp("IOR"); //TRAMPA
	}

	void startUp(String s) {
		ior = s;
	}

	void print() {
		System.out.println(ior);
	}
}

class OrderManager extends CorbaComponent {
	
	OrderManager() {
	}

	void startUp(String s) { //<=EJECUTAR
		ior = getIORFromURL(s);
	}

	String getIORFromURL(String s) {
		return "URL://" + s;
	}
}

public class Application {
	
	public static void main(String args[]) {
		//CorbaComponent otroCc = new OrderManager();
		start(new OrderManager());
	}

	static void start(CorbaComponent cc) {
		cc.print();
	}
}