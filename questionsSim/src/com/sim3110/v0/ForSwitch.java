package com.sim3110.v0;

public class ForSwitch {
	public static void main(String args[]) {
		char i = 1;
			
			switch (i) {
			case 0:
				System.out.println("0");
			case '0': // 48
				System.out.println("A");
			case 1:
				System.out.println("B");
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