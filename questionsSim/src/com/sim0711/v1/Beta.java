package com.sim0711.v1;

class Baap {
	public int h = 4;

	public int getH() {
		System.out.println("Baap " + h);
		return h;
	}
}

public class Beta extends Baap {
	public int h = 44;

	@Override
	public int getH() {
		super.getH();
		System.out.println("Beta " + h);
		return h;
	}

	public static void main(String[] args) {
		Baap b = new Beta();
		System.out.println(((Baap)b).getH());
		
	}
}