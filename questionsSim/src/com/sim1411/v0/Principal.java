package com.sim1411.v0;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {

		LocalDate d1 = LocalDate.parse("2023-11-14", DateTimeFormatter.ISO_DATE);
		LocalDate d2 = LocalDate.of(2023, 11, 14);
		LocalDate d3 = LocalDate.now();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
