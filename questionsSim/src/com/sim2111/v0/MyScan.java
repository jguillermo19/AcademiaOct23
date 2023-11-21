package com.sim2111.v0;

import java.util.Scanner;

public class MyScan {

	public static void main(String[] args) {

		String in = "1 a 10 . 100 1000";
		Scanner s = new Scanner(in);
		int accum = 0;
		
		for (int x=0;x<4;x++) {
			accum += s.nextInt();
		}
		
		System.out.println(accum);
	}

}
