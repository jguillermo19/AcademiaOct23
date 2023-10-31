package com.sim3110.v0;

//What letters will be printed by this program?

//i = 0; 
//Evalua switch con 0 pero i = 1
//i = 1;
//i = 2
//Evalua switch con 2 pero i = 3
//Imprime: C
//i = 4
//Imprime: E F
//i = 5

public class ForSwitchV1 {
	public static void main(String args[]) {
		char i;
		LOOP: for (i = 0; i < 5; i++) {
			
			switch (i++) {
			case '0': // 48
				System.out.println("A");
			case 1:
				System.out.println("B");
				break LOOP;
			case 2:
				System.out.println("C");
				break;
			case 3:
				System.out.println("D");
				break;
			case 4:
				System.out.println("E");
			case 'E':
				System.out.println("F");
			}
			
		}
	}
}