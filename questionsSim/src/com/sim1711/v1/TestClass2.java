package com.sim1711.v1;

class X {
	int val = 10;
}

class Y extends X {
	Y val = null; // 1
}

public class TestClass2 extends X {

	public static void main(String[] args) {

		Y y = new Y();
		
		Y yy = y.val;
		
		X k = (X)yy;

		//int k = ((X)y).val ; //2

		System.out.println(k);
	}

}
