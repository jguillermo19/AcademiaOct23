package com.sim3110.v0;

public class ForSwitchV4 {

	public static void main(String[] args) {
		int r = test('a');
		System.out.println(r);
	}

	public static int test(char i) {

		//for (char i = 0; i < 5; i++) {

			switch (i) {
			case 0:
				System.out.println("A");
			case 1:
				System.out.println("B");
				//break LOOP;
			case 2:
				System.out.println("C");
				//return 1;
			case 3:
				System.out.println("D");
				//return 2;
			case 4:
				System.out.println("E");
				//break;
			case 'E':
				System.out.println("F");
			default: return 0;
			}

		//}
		//return 0;

	}

}