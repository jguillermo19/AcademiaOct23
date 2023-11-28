package com.sim2711.v0;

public class TestClass2 {

	public static void doStuff() {
		System.out.println("Doing stuff...");
		double r = Math.random();
		System.out.println("r: " + r);

		try {
			if (r > 0.4) {
				throw new Exception("Too high!");
			}
		} catch (Exception e) {

		} finally {
			//throw new Exception("Too low!");
		}
		//System.out.println("Done stuff.");

	}

	public static void main(String[] args) {

		doStuff();

		System.out.println("Over");
	}
}

// SI random() es mayor a 0.4
// "Doing stuff..."
// Lanzar la Exception

//SI random() es menor a 0.4
//"Doing stuff..."
//"Done stuff."
//"Over"

/*
 * Which of the following are possible outputs when the above program is
 * compiled and run?
 * 
 * (Assume that Math.random() returns a double between 0.0 and 1.0 not including
 * 1.0. Further assume that there is no mistake in the line numbers printed in
 * the output shown in the options.)
 */