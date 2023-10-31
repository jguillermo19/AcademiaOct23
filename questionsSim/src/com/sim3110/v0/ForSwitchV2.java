package com.sim3110.v0;


public class ForSwitchV2 {
	public static void main(String args[]) {
		char i;
		
		//B
		
		LOOP: for (i = 0; i < 5; i++) {
			
			switch (++i) {
			case 0: 
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