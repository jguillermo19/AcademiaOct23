package com.sim0711.v2;

//What will the following program print?
interface Flyer {
}

class AirPlane implements Flyer {
}

public class TestClass {
	//OVERLOADING
	static void flyIt(Flyer f) {
		System.out.println("Flyer Flying");
	}
	//OVERLOADING
	static void flyIt(AirPlane a) {
		System.out.println("AirPlane Flying");
	}

	public static void main(String[] args) {
		Flyer f = new AirPlane();
		AirPlane a = new AirPlane();
		flyIt(f); // 1 Flyer Flying 
		flyIt(a); // 2 AirPlane Flying
	}
}