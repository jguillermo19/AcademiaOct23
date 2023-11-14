package com.sim1411.v0;

import java.time. *; 
import java.time.format. *;

public class Principal2 {

	public static void main(String[] args) { 
        LocalDateTime greatDay = 
        		LocalDateTime.parse("2015-01-01");
        String greatDayStr = 
        		greatDay.format(DateTimeFormatter.ISO_DATE_TIME); 
        System.out.println(greatDayStr);
   } 

}
