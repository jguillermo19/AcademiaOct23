package com.sim1711.v0;

class Papa {
	int value = 10;
}

class Hijo extends Papa {
	int value = 5;
}

public class TestClass extends X {

	public static void main(String[] args) {

		Hijo hijo= new Hijo();
		
		//Papa papa = (Papa)hijo;
		
		System.out.println("Value: "+((Papa)hijo).value);
	}

}
