package com.sim1411.v0;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Principal3 {

	public static void main(String[] args) {
		//You want to print the date that represents upcoming tuesday from now even if the current day is a 
		//tuesday. Which of the following lines of code accomplishe(s) this?

		System.out.println(LocalDate.now()
		   .with(TemporalAdjusters.next(DayOfWeek.TUESDAY))); 

		System.out.println(LocalDate.now()
		   .with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY))); 

//		System.out.println(new LocalDate()
//		   .with(TemporalAdjusters.next(DayOfWeek.TUESDAY))); 
//
//		System.out.println(new LocalDate()
//		   .adjust(TemporalAdjusters.next(DayOfWeek.TUESDAY))); 

		System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY)
		   .adjustInto(LocalDate.now()));
	}

}
