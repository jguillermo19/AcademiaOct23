package com.sim0911.v2;

public class TestClass {
	//m1 Starts - 1 - 4 -  Aborta
	//
	public static void main(String args[]) {
		try {
			m1();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("1");
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("2");
			return;
		} catch (Exception e) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		System.out.println("END");
	}

	static void m1() {
		System.out.println("m1 Starts");
		throw new IndexOutOfBoundsException("Big Bang ");
	}
}

//	You had to select 3 options 
//	The program will print m1 Starts.
//	The program will print m1 Starts, 1 and 4, in that order.
//	The program will print m1 Starts, 1 and 2, in that order.
//	The program will print m1 Starts, 1, 2 and 4 in that order.
//	END will not be printed.
